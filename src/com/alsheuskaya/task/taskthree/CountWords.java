package com.alsheuskaya.task.taskthree;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
    private static final String REGEX = "\\s+";
    public static void main(String[] args) {
        System.out.println("Enter your sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.strip().split(REGEX);
        System.out.println("Quantity of words is " + words.length);
        System.out.println("List of sorted words ");
        Arrays.stream(words).sorted().forEach(s -> System.out.println(s));
        System.out.println("List of words that start with capital letter ");
        Arrays.stream(words).forEach(s -> System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1)));
    }
}
