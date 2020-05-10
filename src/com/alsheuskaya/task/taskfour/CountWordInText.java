package com.alsheuskaya.task.taskfour;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordInText {
    private static final String REGEX = "[^A-Za-zА-Яа-я]+";

    public static void main(String[] args) {
        System.out.println("Enter text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Enter the word which you want to count:  ");
        String word = scanner.nextLine();
        System.out.println("The word " + word + " is repeated " + countWordsInText(text, word) + " times");
        System.out.println(countWordsInText(text, word));
    }

    public static int countWordsInText(String text, String word) {
        String[] strings = text.split(REGEX);
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            int count = 1;
            string = string.toLowerCase();
            if (map.containsKey(string)) {
                count = map.get(string);
                count++;
                map.remove(string);
            }
            map.put(string, count);
        }
        return map.get(word);
    }
}
