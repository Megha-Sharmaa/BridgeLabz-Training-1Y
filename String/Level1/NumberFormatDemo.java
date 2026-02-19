package com.GLA.Strings.Level1;

import java.util.Scanner;

public class NumberFormatDemo {


    public static void generateException(String text) {

        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }


    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println(" Caught NumberFormatException: Input string is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println(" Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating NumberFormatException:");

        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nHandling NumberFormatException safely:");

        handleException(text);

        sc.close();
    }
}