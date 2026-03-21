package com.gla.Exception.level1;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ask size of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = null;

            // Initialize array only if size > 0
            if (size > 0) {
                arr = new int[size];

                // Input elements
                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            // Ask index
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Access element
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        finally {
            sc.close();
        }
    }
}

