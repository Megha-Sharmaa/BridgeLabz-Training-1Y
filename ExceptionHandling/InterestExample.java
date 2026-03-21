package com.gla.Exception.level1;

public class InterestExample {
    // Method with throws (exception propagation)
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // throw keyword (manually throwing exception)
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Simple Interest Formula
        double interest = (amount * rate * years) / 100;
        return interest;
    }

    public static void main(String[] args) {
        try {
            double amount = 1000;
            double rate = 5;
            int years = 2;

            double result = calculateInterest(amount, rate, years);

            System.out.println("Interest: " + result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

