package org.uzum.iggytoto.javacore_streams;

import org.uzum.iggytoto.javacore_streams.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Класс для реализации домашнего задания номер три, часть 2.
 */
public class Homework3_2 {

    /**
     * Реализовать метод при помощи {@link java.util.stream.Stream} который:
     * - группирует заданых персон по возрасту
     * - фильтрует по минимальному возрасту
     * - фильтрует тех у кого есть хотя бы одно хобби из заданного фильтра
     * - Убирает дубликаты персон по имени
     * @param persons - заданный список персон
     * @param minimalAgeFilter - указанный минимальный возраст
     * @param removeDupes - флаг отвечающий за исключение дубликатов из результата
     * @return словарь где ключ хобби а значение лист персон с этим хобби
     */
    public Map<Integer, List<Person>> groupByAge(List<Person> persons, int minimalAgeFilter, boolean removeDupes) {
        if (removeDupes) {
            persons = persons.stream().distinct().toList();
        }
        return persons.stream()
                .filter(person -> person.getAge() >= minimalAgeFilter)
                .collect(Collectors.groupingBy(Person::getAge));
    }


    public Map<Integer, List<Person>> groupByAgeAndRemoveDupesByName(List<Person> persons, int minimalAgeFilter, boolean removeDupes) {
        ArrayList<String> list = new ArrayList<>();

        Predicate<Person> checkDupes = person -> {
            if (list.contains(person.getName())) {
                return false;
            } else {
                list.add(person.getName());
                return true;
            }
        };

        if (removeDupes) {
            persons = persons.stream().filter(checkDupes).toList();
        }

        return persons.stream()
                .filter(person -> person.getAge() >= minimalAgeFilter)
                .collect(Collectors.groupingBy(Person::getAge));
    }
}
