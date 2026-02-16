package com.gla.array.level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; // physics, chemistry, maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextDouble();
            if (marks[i][0] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student data.");
                i--;
                continue;
            }

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();
            if (marks[i][1] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student data.");
                i--;
                continue;
            }

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();
            if (marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student data.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        System.out.println("\nPhy\tChem\tMath\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\t%.1f\t%.1f\t%.2f\t%s\n",
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }
    }
}


