package com.springfuse.blog.projectlombok.advanced;

import static com.jayway.awaitility.Awaitility.await;
import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChuckTest {
    ThreadPoolExecutor threadPool;

    @Before
    public void setup() {
        threadPool = (ThreadPoolExecutor) newCachedThreadPool();
    }

    @After
    public void tearDown() throws InterruptedException {
        threadPool.shutdown();
        threadPool.shutdownNow();
    }

    private Callable<Boolean> isFinished() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return threadPool.getActiveCount() == 0;
            }
        };
    }

    private void test(final Chuck chuck) throws Exception {
        int nbThreads = 400;
        final int timeToWaitInMs = nbThreads * Chuck.SLEEP_IN_MS;
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                synchronized (chuck) {
                    try {
                        System.out.println("I am locking " + chuck.getClass().getSimpleName() + " instance for " + timeToWaitInMs + "ms");
                        TimeUnit.MILLISECONDS.sleep(timeToWaitInMs);
                    } catch (InterruptedException ignore) {
                        //
                    }
                }
            }
        });
        for (int i = 0; i < nbThreads; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    chuck.norris();
                }
            });
        }
        await().atMost(timeToWaitInMs + 100, MILLISECONDS).until(isFinished());
    }

    @Test(expected = TimeoutException.class)
    public void synchronizedChuck() throws Exception {
        test(new SynchronizedChuck(false));
    }

    @Test
    public void lombokSynchronizedChuck() throws Exception {
        test(new LombokChuck(false));
    }
}
