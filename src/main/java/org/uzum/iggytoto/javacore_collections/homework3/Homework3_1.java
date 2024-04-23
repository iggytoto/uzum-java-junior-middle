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
    public Map<String, Integer> countWords(String text) {
        HashMap<String, Integer> result = new HashMap<>();
        if (text != null) {
            StringBuilder word = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    word.append(c);
                } else if (!word.isEmpty()) {
                    result.compute(word.toString().toLowerCase(), (key, value) -> (value == null) ? 1 : value + 1);
                    word = new StringBuilder();
                }
            }

            if (!word.isEmpty()) {
                result.compute(word.toString().toLowerCase(), (key, value) -> (value == null) ? 1 : value + 1);
            }
        }
        return result;
    }
}
