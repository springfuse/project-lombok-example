package com.springfuse.blog.projectlombok.advanced;

import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import lombok.Synchronized;

public class LombokChuck implements Chuck {
    private final boolean verbose;

    public LombokChuck(boolean verbose) {
        this.verbose = verbose;
    }

    @Synchronized
    public int norris() {
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
