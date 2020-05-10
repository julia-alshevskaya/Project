package com.alsheuskaya.task.tasktwo;

import java.util.Scanner;

public class DivisorMultiple {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner scannerFirst = new Scanner(System.in);
        double numberOne = 0;

        while (true) {
            try {
                numberOne = Double.valueOf(scannerFirst.nextLine().trim().replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input Error");
            }
        }
        System.out.println("Enter the second number: ");
        Scanner scannerSecond = new Scanner(System.in);
        double numberTwo = 0;
        while (true) {
            try {
                numberTwo = Double.valueOf(scannerSecond.nextLine().trim().replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input Error");
            }
        }
        method(numberOne, numberTwo);
    }

    public static double gcd(double a, double b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void method(double a, double b) {
        if (a == (long) (a) && b == (long) b) {
            System.out.println("Greatest Common Divisor " + gcd(a, b));
            System.out.println("Least Common Multiple " + a / gcd(a, b) * b);
        } else {
            System.out.println("Error! Entered number is not integer.");
        }
    }
}
