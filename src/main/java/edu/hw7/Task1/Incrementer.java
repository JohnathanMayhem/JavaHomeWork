package edu.hw7.Task1;

import java.util.ArrayList;

public class Incrementer {

    public volatile int value;

    public Incrementer(int value) {
        this.value = value;
    }

    public synchronized void increment() {
        value += 1;
    }

    public int getValue() {
        return value;
    }

    public static int incrementWithThreads(Incrementer incrementer, int amountOfThreads) {
        ArrayList<Thread> threads = new ArrayList<>(amountOfThreads);
        for (int i = 0; i < amountOfThreads; i++) {
            var increaser = new Thread(() -> incrementer.increment());
            threads.add(increaser);
        }
        for (var thread : threads) {
            thread.run();
        }
        try {
            for (var thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return incrementer.value;
    }

}
