package com.GLA.Methods.Level2;

import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is Negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is Zero.");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First element " + numbers[0] + " is greater than last element " + numbers[4]);
        } else if (result == 0) {
            System.out.println("First element " + numbers[0] + " is equal to last element " + numbers[4]);
        } else {
            System.out.println("First element " + numbers[0] + " is less than last element " + numbers[4]);
        }

        sc.close();
    }
}