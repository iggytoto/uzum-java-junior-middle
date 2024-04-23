/*
 * Author Steven Yeoh
 * Copyright (c) 2020. All rights reserved.
 */

package org.uzum.iggytoto.javacore_streams.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class PersonBuilder
{
    private PersonBuilder() {}

    public static Person getJohn()
    {
        Map<String, String> family = new HashMap<>();
        family.put("wife", "Mrs John");
        family.put("son", "David");
        family.put("daughter", "Margaret");
        return new Person("John", 55, toList("Workout", "Fishing"), family);
    }

    public static Person getBob()
    {
        Map<String, String> family = new HashMap<>();
        family.put("wife", "Mrs Bob");
        family.put("son", "Chris");
        return new Person("Bob", 30, toList("Basketball", "Workout"), family);
    }

    public static Person getAnthony()
    {
        Map<String, String> family = new HashMap<>();
        family.put("wife", "Mrs Anthony");
        family.put("son", "Paul");
        family.put("daughter", "Paul");
        return new Person("Anthony", 30, toList("Drawing", "Cycling", "Swimming"), family);
    }

    public static Person getArnold(){
        Map<String, String> family = new HashMap<>();
        return new Person("Arnold", 30, toList("Workout", "Acting", "Swimming"), family);
    }

    public static Person getTom(){
        Map<String, String> family = new HashMap<>();
        return new Person("Tom", 30, toList("Eating", "Sleeping", "Walking"), family);
    }

    public static Person getCat(){
        Map<String, String> family = new HashMap<>();
        return new Person("Cat", 30, toList("Eating", "Sleeping", "Walking"), family);
    }

    private static List<String> toList(String... hobbies)
    {
        return Stream.of(hobbies).collect(Collectors.toList());
    }

}
