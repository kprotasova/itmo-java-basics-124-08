package itmo.java.basics.threads;

import java.util.concurrent.CountDownLatch;

public class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            Thread counterThread = new Thread(new CounterThread(counter, countDownLatch));
            counterThread.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Counter = " + counter.getCount());
    }
}


