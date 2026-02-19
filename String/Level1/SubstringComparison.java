package com.GLA.Strings.Level1;

import java.util.Scanner;

public class SubstringComparison {


    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
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


        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();


        String manualSubstring = createSubstring(text, start, end);


        String builtInSubstring = text.substring(start, end);


        boolean comparisonResult = compareStrings(manualSubstring, builtInSubstring);


        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Comparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println(" Both substrings are identical.");
        } else {
            System.out.println(" Substrings differ.");
        }

        sc.close();
    }
}