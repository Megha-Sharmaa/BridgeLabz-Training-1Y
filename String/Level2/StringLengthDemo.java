package com.GLA.Strings.Level1;

import java.util.Scanner;

public class StringLengthDemo {

    public static int findLengthManual(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int manualLength = findLengthManual(text);
        int builtInLength = text.length();

        System.out.println("\nManual Length Calculation: " + manualLength);
        System.out.println("Built-in Length Calculation: " + builtInLength);

        if (manualLength == builtInLength) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ.");
        }

        sc.close();
    }
}