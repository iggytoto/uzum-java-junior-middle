package org.uzum.iggytoto.javacore_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLockExample {

    public static void main(String[] args){
        final Object monitor1 = new Object();
        final Object monitor2 = new Object();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            synchronized (monitor1) {
                System.out.println("thread 1 locked monitor 1");
                try {
                    Thread.sleep(100);
                    synchronized (monitor2) {
                        System.out.println("thread 1 locked monitor 2");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executorService.submit(() -> {
            synchronized (monitor2){
                System.out.println("thread 2 locked monitor 2");
                try {
                    Thread.sleep(100);
                    synchronized (monitor1){
                        System.out.println("thread 2 locked monitor 1");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
