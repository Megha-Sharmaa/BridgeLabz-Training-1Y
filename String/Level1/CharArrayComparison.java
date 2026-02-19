package com.GLA.Strings.Level1;

import java.util.Scanner;

public class CharArrayComparison {


    public static char[] getCharsManual(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }


    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String text = sc.next();


        char[] manualChars = getCharsManual(text);


        char[] builtInChars = text.toCharArray();


        boolean comparisonResult = compareCharArrays(manualChars, builtInChars);


        System.out.println("\nCharacters using manual method:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nComparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println(" Both arrays are identical.");
        } else {
            System.out.println(" Arrays differ.");
        }

        sc.close();
    }
}