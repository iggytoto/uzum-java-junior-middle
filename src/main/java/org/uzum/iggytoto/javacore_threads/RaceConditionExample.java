package org.uzum.iggytoto.javacore_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        final int[] value = {0};
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        IntStream.range(0, 100).forEach((ignored) -> executorService.submit(() -> {
            value[0] = value[0] + 1;
        }));

        Thread.sleep(5000);

        System.out.println(value[0]);
    }

}
