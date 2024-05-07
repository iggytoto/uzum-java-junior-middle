package org.uzum.iggytoto.java_algorithms;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class QuickSortVsBubble {

    public static void main(String[] args) {
        final int[] a = new int[100_000_000];
        final int[] b = new int[100_000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10000);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextInt(10000);
        }

        var quickSortStart = Instant.now().getEpochSecond();
        Arrays.sort(a);
        System.out.println("QuickSortTime:" + (Instant.now().getEpochSecond() - quickSortStart));

        var bubbleSortStart = Instant.now().getEpochSecond();
        sort(b);
        System.out.println("BubbleSortTime:" + (Instant.now().getEpochSecond() - bubbleSortStart));


    }

    public static void sort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if(array[j] > array[j+1]){
                    var tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


}
