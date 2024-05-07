package org.uzum.iggytoto.java_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Homework6_2Test {


    @Test
    public void test(){
        final var hw = new Homework6_2();

        Assertions.assertEquals(2,hw.longestMonotonicSubarray(new int[]{1,4,3,3,2}));
        Assertions.assertEquals(1,hw.longestMonotonicSubarray(new int[]{3,3,3,3}));
        Assertions.assertEquals(3,hw.longestMonotonicSubarray(new int[]{3,2,1}));
    }
}