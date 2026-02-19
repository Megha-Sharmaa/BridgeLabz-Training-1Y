package com.GLA.Methods.level3;

import java.util.Scanner;

public class MatrixManipulation {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // random values 0–9
            }
        }
        return matrix;
    }

    // Method to find transpose
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Determinant of 2x2
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double)det;
        inverse[0][1] = -matrix[0][1] / (double)det;
        inverse[1][0] = -matrix[1][0] / (double)det;
        inverse[1][1] = matrix[0][0] / (double)det;
        return inverse;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) return null;

        double[][] inverse = new double[3][3];
        // Cofactor matrix
        inverse[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / (double)det;
        inverse[0][1] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / (double)det;
        inverse[0][2] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / (double)det;

        inverse[1][0] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / (double)det;
        inverse[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / (double)det;
        inverse[1][2] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / (double)det;

        inverse[2][0] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / (double)det;
        inverse[2][1] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]) / (double)det;
        inverse[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / (double)det;

        return inverse;
    }

    // Method to display integer matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%6d", val);
            }
            System.out.println();
        }
    }

    // Method to display double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%10.4f", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        int[][] matrix = createRandomMatrix(size, size);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (size == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant (2x2) = " + det);
            double[][] inverse = inverse2x2(matrix);
            if (inverse != null) {
                System.out.println("\nInverse (2x2):");
                displayMatrix(inverse);
            } else {
                System.out.println("\nInverse does not exist (determinant = 0).");
            }
        } else if (size == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant (3x3) = " + det);
            double[][] inverse = inverse3x3(matrix);
            if (inverse != null) {
                System.out.println("\nInverse (3x3):");
                displayMatrix(inverse);
            } else {
                System.out.println("\nInverse does not exist (determinant = 0).");
            }
        }

        sc.close();
    }
}