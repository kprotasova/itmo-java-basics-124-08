package itmo.java.basics.threads;

public class SomeKindOfThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        for (int i = 0; i <= 100; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": now is number " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " ended");
    }
}
