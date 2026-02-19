package com.GLA.Strings.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {


    public static void generateException(String[] names) {

        System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
    }


    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element at index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Caught ArrayIndexOutOfBoundsException: Index is out of range for the given array.");
        } catch (RuntimeException e) {
            System.out.println(" Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");

        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nHandling ArrayIndexOutOfBoundsException safely:");

        handleException(names);

        sc.close();
    }
}