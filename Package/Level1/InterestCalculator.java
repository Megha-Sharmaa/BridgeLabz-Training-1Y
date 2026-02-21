package com.GLA.Package.Level1;

import static java.lang.Math.*;

public class InterestCalculator {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * (pow((1 + rate / 100), time)) - principal;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);
    }
}