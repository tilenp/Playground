package com.company.sudoku;

public class SudokuSolverJava {

    public static void main(String[] args) {

    }

    public boolean solveSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if (board[row][column] == '.') {
                    for (char value = '1'; value <= '9'; value++) {//trial. Try 1 through 9
                        if (isValid(board, row, column, value)) {
                            board[row][column] = value; //Put value for this cell

                            if (solveSudoku(board))
                                return true; //If it's the solution return true
                            else
                                board[row][column] = '.'; //Otherwise go back
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        int nRow = 3 * (row / 3);  // normalized row
        int nCol = 3 * (col / 3);    // normalized col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false; //check row
            if (board[row][i] == c) return false; //check column
            if (board[nRow + i / 3][nCol + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }
}
