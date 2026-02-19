package com.GLA.Methods.level3;

import java.util.Arrays;

public class ZaraBonusCalculator {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2]; // column 0 = salary, column 1 = years of service
        for (int i = 0; i < count; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 11); // years of service (0–10)
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2]; // column 0 = bonus, column 1 = new salary
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to calculate totals
    public static void calculateTotals(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][1];
            totalBonus += newData[i][0];
        }

        System.out.println("\nSummary Totals:");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        System.out.println("Employee Data (Salary, Years, Bonus, New Salary):");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-12s%n", "Salary", "Years", "Bonus", "New Salary");

        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%-10d %-10d %-10.2f %-12.2f%n",
                    employeeData[i][0], employeeData[i][1], bonusData[i][0], bonusData[i][1]);
        }

        calculateTotals(employeeData, bonusData);
    }
}