package com.GLA.Strings.Level1;

import java.util.Scanner;

public class LowerCaseComparison {

    public static String convertToLowerManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
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

        String manualLower = convertToLowerManual(text);
        String builtInLower = text.toLowerCase();

        boolean comparisonResult = compareStrings(manualLower, builtInLower);

        System.out.println("\nManual Lowercase Conversion: " + manualLower);
        System.out.println("Built-in Lowercase Conversion: " + builtInLower);
        System.out.println("Comparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both conversions are identical.");
        } else {
            System.out.println("Conversions differ.");
        }

        sc.close();
    }
}