package org.uzum.iggytoto.javacore_collections.homework3;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для реализации домашнего задания номер три, часть 1.
 */
public class Homework3_1 {

    /**
     * Реализовать метод который считает количество слов встречающихся в заданном тексте.
     * @param text - заданный текст
     * @return - словарь слов и количество их появлений в данном тексте
     */
    public Map<String,Integer> countWords(String text){
        // method converts all words in to lower case for case-insensitivity
        text = text.toLowerCase();

        // method replaces all punctual characters with space
        text = text.replaceAll("\\p{Punct}", " ");

        // method splits the text into words based on whitespace
        String[] words = text.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        return wordCounts;
    }
}
