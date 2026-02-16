package com.gla.array.level1;

import java.util.Scanner;

class SumOfMultipleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        int i = 0;

        while (i < 10) {
            System.out.print("Enter number: ");
            double n = sc.nextDouble();

            if (n <= 0) {
                break;
            }

            arr[i] = n;
            i++;
        }

        System.out.println("Numbers entered:");
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
            sum += arr[j];
        }

        System.out.println("Sum = " + sum);
    }
}

