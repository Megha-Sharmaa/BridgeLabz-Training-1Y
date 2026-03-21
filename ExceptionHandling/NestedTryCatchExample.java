package com.gla.Exception.level1;
import java.util.Scanner;
public class NestedTryCatchExample {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // Input elements
            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Input index
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                // Access element (may throw ArrayIndexOutOfBoundsException)
                int value = arr[index];

                // Input divisor
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Division (may throw ArithmeticException)
                int result = value / divisor;

                System.out.println("Result: " + result);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            sc.close();
        }
    }
}

