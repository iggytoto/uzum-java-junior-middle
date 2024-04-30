package org.uzum.iggytoto.javacore_threads;

import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolExample {

    public static void main(String[] args){

        System.out.println(Runtime.getRuntime().availableProcessors());


        int[] array = new int[100000];

        var start = Instant.now().getNano();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        ForkJoinPool fjp = new ForkJoinPool();
        long res = fjp.invoke(new SumTask(array,0,array.length, 10000));

        System.out.println(res);
        System.out.println(Instant.now().getNano() - start);

        start = Instant.now().getNano();
        fjp = new ForkJoinPool();
        res = fjp.invoke(new SumTask(array,0,array.length, 100));

        System.out.println(res);
        System.out.println(Instant.now().getNano() - start);


    }

    public static class SumTask extends RecursiveTask<Integer> {

        private int threshold;
        private int[] array;
        private int start;
        private int end;

        public SumTask( int[] array, int start, int end,int threshold) {
            this.threshold = threshold;
            this.array = array;
            this.start = start;
            this.end = end;
        }


        @Override
        protected Integer compute() {
            if (end - start <= threshold) {
                var sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                int middle = (start + end )/2;
                SumTask left = new SumTask(array, start, middle,threshold);
                SumTask right = new SumTask(array, middle, end,threshold);
                left.fork();

                int rightResult = right.compute();
                int leftResult = left.join();

                return leftResult + rightResult;
            }
        }
    }
}
