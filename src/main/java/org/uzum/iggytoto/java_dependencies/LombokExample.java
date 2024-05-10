package org.uzum.iggytoto.java_dependencies;

import lombok.*;
import org.uzum.iggytoto.java_dependencies.model.Person;

public class LombokExample {

    @SneakyThrows
    public static void main(String[] args) {
        var p = new Person();
        p = new Person("test", "test@test.test", 33);
        p.setAge(32323);
        p.setName("asdasd");
        p.setEmail("dddd");
        var p2 = p.clone();
        System.out.println(p);
        System.out.println(p.equals(p2));
    }
}
