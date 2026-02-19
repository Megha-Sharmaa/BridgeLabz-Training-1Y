package com.GLA.Methods.Level1;

import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        double distance = 5000; // 5 km in meters
        double rounds = calculateRounds(side1, side2, side3, distance);

        System.out.println("The athlete must complete " + Math.ceil(rounds) +
                " rounds to run at least 5 km.");

        sc.close();
    }
}