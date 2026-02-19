package com.GLA.Strings.Level1;

import java.util.Scanner;

public class TrimComparison {

    public static int[] trimManual(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringManual(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
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

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        int[] indexes = trimManual(text);
        String manualTrim = substringManual(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        boolean comparisonResult = compareStrings(manualTrim, builtInTrim);

        System.out.println("\nManual Trim Result: \"" + manualTrim + "\"");
        System.out.println("Built-in Trim Result: \"" + builtInTrim + "\"");
        System.out.println("Comparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both trim operations are identical.");
        } else {
            System.out.println("Trim operations differ.");
        }

        sc.close();
    }
}
