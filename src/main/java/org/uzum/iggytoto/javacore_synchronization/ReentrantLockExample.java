package org.uzum.iggytoto.javacore_synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    public static void main(String[] args){

        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(new Worker(1,lock));
        Thread t2 = new Thread(new Worker(2,lock));
        Thread t3 = new Thread(new AlternateWorker(lock));

        t1.start();
        t2.start();
        t3.start();


    }

    public static class Worker implements Runnable {

        private int index;
        private Lock lock;

        public Worker(int i,Lock l){
            index = i;
            lock = l;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("Thread:" + index + " started work.");
                Thread.sleep(2000);
                System.out.println("Thread:" + index + " finished work.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static  class AlternateWorker implements Runnable{

        private final Lock lock;

        public AlternateWorker(Lock lock){
            this.lock = lock;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(lock.tryLock()){
                try {
                    System.out.println("Thread:A started work.");
                    Thread.sleep(2000);
                    System.out.println("Thread:A finished work.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } else {

                try {
                    System.out.println("do some other work");
                    Thread.sleep(2000);
                    System.out.println("do some other work done");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
