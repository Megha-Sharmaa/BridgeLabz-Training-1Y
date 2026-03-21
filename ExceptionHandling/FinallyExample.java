package com.gla.Exception.level1;
import java.util.Scanner;
public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // User input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Division
            int result = a / b;

            // Output
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        finally {
            // Always executes
            System.out.println("Operation completed");
            sc.close();
        }
    }
}

