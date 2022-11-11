package com.company.sudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudokuJava2 {

    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char value = board[row][column];
                if (value == '.') {
                    continue;
                }
                // will get the same row 9 times, value should not be the same
                // will get column 9 times, value should not be the same
                // will get square with the same row and column 9 times, value should not be the same
                if (!set.add("row" + row + "value" + value) ||
                        !set.add("column" + column + "value" + value) ||
                        !set.add("square" + row / 3 + ":" + column / 3 + "value" + value)) {
                    return false;
                }
            }
        }
        return true;
    }
}
