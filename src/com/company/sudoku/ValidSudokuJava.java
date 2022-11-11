package com.company.sudoku;

public class ValidSudokuJava {

    public static void main(String[] args) {
        System.out.println("works");
    }

    public static boolean isValidSudoku(char[][] board) {
        return areRowsValid(board) && areColumnsValid(board) && areSquaresValid(board);
    }

    private static boolean areRowsValid(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            boolean[] used = new boolean[9 + 1];
            for (int column = 0; column < board[row].length; column++) {
                char current = board[row][column];
                if (current == '.') {
                    continue;
                }
                if (used[current - '0']) {
                    return false;
                }
                used[current - '0'] = true;
            }
        }
        return true;
    }

    private static boolean areColumnsValid(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            boolean[] used = new boolean[9 + 1];
            for (int column = 0; column < board[row].length; column++) {
                char current = board[column][row];
                if (current == '.') {
                    continue;
                }
                if (used[current - '0']) {
                    return false;
                }
                used[current - '0'] = true;
            }
        }
        return true;
    }

    private static boolean areSquaresValid(char[][] board) {
        for (int row = 0; row < board.length; row += 3) {
            for (int column = 0; column < board[row].length; column += 3) {
                if (!isSquareValid(board, row, row + 3, column, column + 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSquareValid(char[][] board, int rowStart, int rowEnd, int columnStart, int columnEnd) {
        boolean[] used = new boolean[9 + 1];
        for (int row = rowStart; row < rowEnd; row++) {
            for (int column = columnStart; column < columnEnd; column++) {
                char current = board[row][column];
                if (current == '.') {
                    continue;
                }
                if (used[current - '0']) {
                    return false;
                }
                used[current - '0'] = true;
            }
        }
        return true;
    }
}
