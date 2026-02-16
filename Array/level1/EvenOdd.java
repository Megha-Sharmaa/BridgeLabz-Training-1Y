package com.gla.Array.level1;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error");
            return;
        }

        int[] odd = new int[n];
        int[] even = new int[n];
        int e = 0, o = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[e] = i;
                e++;
            } else {
                odd[o] = i;
                o++;
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }
    }
}