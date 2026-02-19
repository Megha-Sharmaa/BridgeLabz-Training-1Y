package com.GLA.Strings.Level1;

import java.util.Scanner;

public class SplitWordsWithLength {

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

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLengthManual(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] manualSplit = splitManual(text);
        String[][] wordLengthArray = wordsWithLength(manualSplit);

        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
        }

        sc.close();
    }
}