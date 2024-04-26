package org.uzum.iggytoto.javacore_threads;

public class FunctionalRunnableExample {

    public static void main(String[] args) {
        int countTo = 10;
        final Thread t = new Thread(() -> {
            var i = 0;
            while (i < countTo) {
                System.out.println(i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
    }
}
