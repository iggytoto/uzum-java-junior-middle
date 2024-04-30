package org.uzum.iggytoto.javacore_threads;

public class ThreadsExample {
    public static void main(String[] args) {
        while (true){
            final SecondsCounter t = new SecondsCounter(1000);
            t.start();
        }
    }

    public static class SecondsCounter extends Thread {

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
