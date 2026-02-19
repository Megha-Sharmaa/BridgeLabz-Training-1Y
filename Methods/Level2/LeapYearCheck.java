package com.GLA.Methods.Level2;

import java.util.Scanner;

public class LeapYearCheck {

    public static boolean isLeapYear(int year) {
        // Rule: Gregorian calendar starts from 1582
        if (year < 1582) {
            return false;
        }
        // Leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year calculation only valid for year >= 1582 (Gregorian calendar).");
        } else {
            if (isLeapYear(year)) {
                System.out.println("Year " + year + " is a Leap Year.");
            } else {
                System.out.println("Year " + year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}