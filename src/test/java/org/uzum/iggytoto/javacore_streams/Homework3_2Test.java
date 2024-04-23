package org.uzum.iggytoto.javacore_streams;

import org.junit.jupiter.api.Test;
import org.uzum.iggytoto.javacore_streams.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Homework3_2Test {

    @Test
    public void test() {
        Person person1 = new Person("Alice", 25,List.of(), Map.of());
        Person person2 = new Person("Bob", 30,List.of(), Map.of());
        Person person3 = new Person("Charlie", 25,List.of(), Map.of());

        List<Person> persons = Arrays.asList(person1, person2, person3);

        Homework3_2 processor = new Homework3_2();

        // Test grouping by age without filters
        Map<Integer, List<Person>> result = processor.groupByAge(persons, 0, false);
        assertEquals(2, result.size());
        assertTrue(result.containsKey(25));
        assertTrue(result.containsKey(30));
        assertEquals(2, result.get(25).size());
        assertEquals(1, result.get(30).size());

        // Test grouping by age with minimal age filter
        result = processor.groupByAge(persons, 26, false);
        assertEquals(1, result.size());
        assertTrue(result.containsKey(30));
        assertEquals(1, result.get(30).size());

        // Test grouping by age with removing duplicates
        persons = List.of(person1,person1,person2,person3);
        result = processor.groupByAge(persons, 0, true);
        assertEquals(2, result.size());
        assertTrue(result.containsKey(25));
        assertTrue(result.containsKey(30));
        assertEquals(2, result.get(25).size());
        assertEquals(1, result.get(30).size());
    }


}