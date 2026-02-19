package com.GLA.Methods.level3;

import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores for students
    public static int[][] generateScores(int count) {
        int[][] scores = new int[count][3]; // Physics, Chemistry, Maths
        for (int i = 0; i < count; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50; // Physics (50–99)
            scores[i][1] = (int)(Math.random() * 50) + 50; // Chemistry (50–99)
            scores[i][2] = (int)(Math.random() * 50) + 50; // Maths (50–99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = ((double) total / 300) * 100;

            // Round off to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] +
                    "\t" + (int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        int[][] scores = generateScores(count);
        double[][] results = calculateResults(scores);

        displayScoreCard(scores, results);

        sc.close();
    }
}