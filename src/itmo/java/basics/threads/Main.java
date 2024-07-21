package itmo.java.basics.threads;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread someKindOfThread = new Thread(new SomeKindOfThread());
            System.out.println("Thread " + i + " is " + someKindOfThread.getState());
            someKindOfThread.start();
            System.out.println("Thread " + i + " is " + someKindOfThread.getState());
        }
    }
}
