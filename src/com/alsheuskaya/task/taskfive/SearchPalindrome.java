package com.alsheuskaya.task.taskfive;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter the length of the sequence n : ");
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n <= 100 && n > 0) {
                System.out.println("Palindromes: " + searchPalindromes(n));
            } else {
                System.out.println("Error! Enter number from 0 to 100! ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Error! ");
        }
    }

    public static ArrayList<Integer> searchPalindromes(int number) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPalindrome(i)) {
                num.add(i);
            }
        }
        return num;
    }

    private static boolean isPalindrome(int a) {
        int b = 0;
        for (int i = a, j = i % 10; i > 0; i = i / 10, j = i % 10) {
            b = b * 10 + j;
        }
        return a == b;
    }
}
