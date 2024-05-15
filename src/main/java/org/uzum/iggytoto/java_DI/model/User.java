package org.uzum.iggytoto.java_DI.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;

@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private int balance;
}
