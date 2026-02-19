package com.GLA.Methods.Level2;

class UnitConvertor3 {

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double f = 98.6;
        double c = 37;
        double pounds = 10;
        double kilograms = 5;
        double gallons = 2;
        double liters = 7.5;

        System.out.println(f + " °F = " + convertFarhenheitToCelsius(f) + " °C");
        System.out.println(c + " °C = " + convertCelsiusToFarhenheit(c) + " °F");
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms = " + convertKilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}