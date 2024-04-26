package org.uzum.iggytoto.javacore_threads;

public class RunnableExample {
    public static void main(String[] args) {
        final Thread t = new Thread(new SecondsCounter(10));
        t.start();
    }

    public static class SecondsCounter implements Runnable {

        private final int countTo;

        public SecondsCounter(int countTo) {
            this.countTo = countTo;
        }

        @Override
        public void run() {
            var i = 0;
            while (i < countTo) {
                System.out.println(i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
