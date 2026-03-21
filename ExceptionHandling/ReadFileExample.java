package com.gla.Exception.level1;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            // Try to open the file
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;

            // Read and print file content
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        }
        catch (IOException e) {
            // Handle exception if file not found or error occurs
            System.out.println("File not found");
        }
    }
}



