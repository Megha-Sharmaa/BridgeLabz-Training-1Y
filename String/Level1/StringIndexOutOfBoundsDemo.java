package com.GLA.Strings.Level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {


    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }


    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" Caught StringIndexOutOfBoundsException: Index is out of range for the given string.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");

        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException safely:");

        handleException(text);

        sc.close();
    }
}
