package com.GLA.Package.Level1;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double num1 = 25;
        double num2 = -12.5;

        System.out.println("Square root of " + num1 + " = " + sqrt(num1));
        System.out.println("Power (2^3) = " + pow(2, 3));
        System.out.println("Maximum of 10 and 20 = " + max(10, 20));
        System.out.println("Minimum of 10 and 20 = " + min(10, 20));
        System.out.println("Absolute value of " + num2 + " = " + abs(num2));
    }
}