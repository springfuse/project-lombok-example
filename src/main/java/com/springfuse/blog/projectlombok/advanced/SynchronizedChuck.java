package com.springfuse.blog.projectlombok.advanced;

import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class SynchronizedChuck implements Chuck {
    private final boolean verbose;

    public SynchronizedChuck(boolean verbose) {
        this.verbose = verbose;
    }

    public synchronized int norris() {
        if (verbose) {
            System.out.println("Thread " + currentThread().getId() + " norris");
        }
        sleep();
        return 42;
    }

    private static void sleep() {
        try {
            MILLISECONDS.sleep(SLEEP_IN_MS);
        } catch (InterruptedException ignore) {
            //
        }
    }
}
