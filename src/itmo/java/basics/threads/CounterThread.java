package itmo.java.basics.threads;

import java.util.concurrent.CountDownLatch;

public class CounterThread implements Runnable {
    private Counter counter;
    private CountDownLatch countDownLatch;
    public CounterThread (Counter counter, CountDownLatch countDownLatch) {
        this.counter = counter;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        countDownLatch.countDown();
    }
}
