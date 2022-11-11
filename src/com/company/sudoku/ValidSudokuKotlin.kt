package com.company.sudoku

object ValidSudokuKotlin {

    @JvmStatic
    fun main(args: Array<String>) {

    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        return areRowsValid(board) && areColumnsValid(board) && areSquaresValid(board)
    }

    private fun areRowsValid(board: Array<CharArray>): Boolean {
        for (row in board.indices) {
            val cache = BooleanArray(9 + 1)
            for (column in board[row].indices) {
                val current = board[row][column]
                if (current == '.') {
                    continue
                }
                if (cache[current - '0']) {
                    return false
                }
                cache[current - '0'] = true
            }
        }
        return true
    }

    private fun areColumnsValid(board: Array<CharArray>): Boolean {
        for (row in board.indices) {
            val cache = BooleanArray(9 + 1)
            for (column in board[row].indices) {
                val current = board[column][row]
                if (current == '.') {
                    continue
                }
                if (cache[current - '0']) {
                    return false
                }
                cache[current - '0'] = true
            }
        }
        return true
    }

    private fun areSquaresValid(board: Array<CharArray>): Boolean {
        for (row in board.indices step 3) {
            for (column in board[row].indices step 3) {
                if (!isSquareValid(board, row, row + 3, column, column + 3)) {
                    return false
                }
            }
        }
        return true
    }

    private fun isSquareValid(board: Array<CharArray>, rowStart: Int, rowEnd: Int, columnStart: Int, columnEnd: Int): Boolean {
        val cache = BooleanArray(9 + 1)
        for (row in rowStart until rowEnd) {
            for (column in columnStart until columnEnd) {
                val current = board[row][column]
                if (current == '.') {
                    continue
                }
                if (cache[current - '0']) {
                    return false
                }
                cache[current - '0'] = true
            }
        }
        return true
    }
}