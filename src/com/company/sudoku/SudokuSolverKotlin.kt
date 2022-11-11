package com.company.sudoku

object SudokuSolverKotlin {

    fun solveSudoku(board: Array<CharArray>): Boolean {
        for (row in board.indices) {
            for (column in board[0].indices) {
                if (board[row][column] == '.') {
                    for (value in '1'..'9') {
                        if (isValid(board, row, column, value)) {
                            board[row][column] = value //Put value for this cell
                            if (solveSudoku(board)) return true //If it's the solution return true
                            else board[row][column] = '.' //Otherwise go back
                        }
                    }
                    return false
                }
            }
        }
        return true
    }

    private fun isValid(board: Array<CharArray>, row: Int, col: Int, c: Char): Boolean {
        val nRow = 3 * (row / 3) // normalized row
        val nCol = 3 * (col / 3) // normalized col
        for (i in 0 until 9) {
            if (board[i][col] == c) return false //check row
            if (board[row][i] == c) return false //check column
            if (board[nRow + i / 3][nCol + i % 3] == c) return false //check 3*3 block
        }
        return true
    }
}