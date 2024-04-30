package org.uzum.iggytoto.javacore_synchronization;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {

        BlockingQueue<String> q = new ArrayBlockingQueue<>(2);

        Thread pt = new Thread(new Producer(q));
        Thread ct = new Thread(new Consumer(q));

        pt.start();
        ct.start();

    }

    public static class Producer implements Runnable {

        private final BlockingQueue<String> queue;

        public Producer(BlockingQueue<String> q) {
            this.queue = q;
        }

        @Override
        public void run() {
            try {
                var i = 0;
                while (true) {
                    queue.put(String.valueOf(++i));
                    System.out.println("put element" + i + " inte queue");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Consumer implements Runnable {

        private final BlockingQueue<String> queue;

        public Consumer(BlockingQueue<String> q) {
            this.queue = q;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Got element:" + queue.take() + " from queue");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
