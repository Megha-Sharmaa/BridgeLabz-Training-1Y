package com.gla.Exception.level1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {

        // try-with-resources (auto close)
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            // Read first line
            String line = br.readLine();

            if (line != null) {
                System.out.println("First line: " + line);
            } else {
                System.out.println("File is empty");
            }

        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

