package com.GLA.Strings.Level1;

import java.util.Scanner;

public class SplitComparison {

    public static int findLengthManual(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitManual(String text) {
        int length = findLengthManual(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }
        words[index] = text.substring(start, length);

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] manualSplit = splitManual(text);
        String[] builtInSplit = text.split(" ");

        boolean comparisonResult = compareArrays(manualSplit, builtInSplit);

        System.out.println("\nManual Split Result:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nComparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both splits are identical.");
        } else {
            System.out.println("Splits differ.");
        }

        sc.close();
    }
}