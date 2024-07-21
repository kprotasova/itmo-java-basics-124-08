package itmo.java.basics.threads;

public class ThreadName {
    private static Object o = new Object();
    private static boolean isFirst = true;

    static class PrintName implements Runnable {
        private boolean myTurn;

        public PrintName (boolean myTurn) {
            this.myTurn = myTurn;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (isFirst != myTurn) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName());
                    isFirst = !isFirst;
                    o.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread threadName1 = new Thread(new PrintName(true));
        Thread threadName2 = new Thread(new PrintName(false));

        threadName1.start();
        threadName2.start();
    }
}
