package com.alsheuskaya.task.taskone;

import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        while (true) {
            try {
                number = Double.valueOf(scanner.nextLine().trim().replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input Error");
            }
        }
        checkNumber(number);
    }

    public static void checkNumber(double number) {
        if (number == (long) (number)) {
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
            if (number >1) {
                if (isPrime(number)) {
                    System.out.println("Number is prime");
                } else {
                    System.out.println("Number is composite");
                }
            } else {
                System.out.println("Numbers less than two are not prime or composite");
            }
        } else {
            System.out.println("Error! Entered number is not integer.");
        }

    }

    private static boolean isPrime(double num) {
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return num > 1;
    }
}
