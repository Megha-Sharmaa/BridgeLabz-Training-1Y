package com.GLA.Methods.level3;

import java.util.Scanner;

public class LineAndDistance {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and intercept of line
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] line = lineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        sc.close();
    }
}