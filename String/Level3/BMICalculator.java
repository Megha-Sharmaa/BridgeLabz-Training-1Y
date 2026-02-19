package com.GLA.Strings.Level1;

import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double height = hw[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + "\t" +
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t" +
                    result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] result = computeBMI(hw);
        displayResult(result);

        sc.close();
    }
}