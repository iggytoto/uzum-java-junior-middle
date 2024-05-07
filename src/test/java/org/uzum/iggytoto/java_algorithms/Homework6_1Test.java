package org.uzum.iggytoto.java_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework6_1Test {

    @Test
    public void test() {
        final var hw = new Homework6_1();

        Assertions.assertEquals(3, hw.maxDepth(getExample1()));
        Assertions.assertEquals(5, hw.maxDepth(getExample2()));
        Assertions.assertThrows(IllegalArgumentException.class, () -> hw.maxDepth(null));
        Assertions.assertEquals(0, hw.maxDepth(new Homework6_1.Node(1)));
    }

    private Homework6_1.Node getExample2() {
        return new Homework6_1.Node(1,
                List.of(
                        new Homework6_1.Node(2),
                        new Homework6_1.Node(3,
                                List.of(
                                        new Homework6_1.Node(6),
                                        new Homework6_1.Node(7,
                                                List.of(
                                                        new Homework6_1.Node(11,
                                                                List.of(
                                                                        new Homework6_1.Node(14)
                                                                ))
                                                ))
                                )),
                        new Homework6_1.Node(4,
                                List.of(
                                        new Homework6_1.Node(8,
                                                List.of(
                                                        new Homework6_1.Node(12)
                                                ))
                                )),
                        new Homework6_1.Node(5,
                                List.of(
                                        new Homework6_1.Node(9,
                                                List.of(
                                                        new Homework6_1.Node(13)
                                                )),
                                        new Homework6_1.Node(10)
                                ))
                ));
    }

    private Homework6_1.Node getExample1() {
        return new Homework6_1.Node(1,
                List.of(
                        new Homework6_1.Node(3,
                                List.of(new Homework6_1.Node(5), new Homework6_1.Node(6))),
                        new Homework6_1.Node(2),
                        new Homework6_1.Node(4)
                ));
    }

}