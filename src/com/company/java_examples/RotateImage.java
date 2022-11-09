package com.company.java_examples;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        flipHorizontally(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = row; column < matrix[row].length; column++) {
                swap(matrix, row, column, column, row);
            }
        }
    }

    private static void flipHorizontally(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length / 2; column++) {
                swap(matrix, row, column, row, matrix[row].length - 1 - column);
            }
        }
    }

    private static void swap(int[][] matrix, int row1, int column1, int row2, int column2) {
        int temp = matrix[row1][column1];
        matrix[row1][column1] = matrix[row2][column2];
        matrix[row2][column2] = temp;
    }
}
