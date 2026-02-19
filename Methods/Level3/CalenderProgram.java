package com.GLA.Methods.level3;

import java.util.Scanner;

public class CalenderProgram {

    public static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        return months[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Zeller’s Congruence (Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int q = 1; // day of month
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = (q + (13*(m+1))/5 + k + (k/4) + (j/4) + (5*j)) % 7;
        // h = 0 means Saturday, 1 means Sunday, 2 means Monday...
        int dayOfWeek = ((h + 6) % 7); // convert to 0=Sunday,1=Monday,...6=Saturday
        return dayOfWeek;
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("     " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}