package com.GLA.Strings.Level1;

import java.util.Scanner;

public class UpperCaseComparison {

    public static String convertToUpperManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String manualUpper = convertToUpperManual(text);
        String builtInUpper = text.toUpperCase();

        boolean comparisonResult = compareStrings(manualUpper, builtInUpper);

        System.out.println("\nManual Uppercase Conversion: " + manualUpper);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpper);
        System.out.println("Comparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both conversions are identical.");
        } else {
            System.out.println("Conversions differ.");
        }

        sc.close();
    }
}