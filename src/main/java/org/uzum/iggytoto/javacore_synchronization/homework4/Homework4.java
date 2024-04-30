package org.uzum.iggytoto.javacore_synchronization.homework4;

import java.util.concurrent.Phaser;

public class Homework4 {
    //why parties=8, 5 parties for 5 car and other 3 parties for На старт!, Внимание!, Марш!
    private static final Phaser START = new Phaser(8);
    private static final int TRACK_LENGTH = 500000;
    private static Long legalMarshTime;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(i, (int) (Math.random() * 100 + 50))).start();
        }

        while (START.getArrivedParties() < 5) {
            System.out.println("Waiting");
            Thread.sleep(1000);
        }

        Thread.sleep(1000);
        System.out.println("На старт!");
        START.arriveAndDeregister();
        Thread.sleep(1000);
        System.out.println("Внимание!");
        START.arriveAndDeregister();
        Thread.sleep(1000);
        System.out.println("Марш!");
        START.arriveAndDeregister();

        legalMarshTime = System.currentTimeMillis();
    }

    public static class Car implements Runnable {
        private int carNumber;
        private int carSpeed;

        public Car(int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Автомобиль №%d подъехал к стартовой прямой.\n", carNumber);
                START.arriveAndAwaitAdvance();

                Long marshTime = System.currentTimeMillis();
                Thread.sleep(TRACK_LENGTH / carSpeed);
                System.out.printf("Автомобиль №%d финишировал!\n", carNumber);

                if (!marshTime.equals(legalMarshTime)){
                    System.err.println("Program doesn't works correctly");
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
