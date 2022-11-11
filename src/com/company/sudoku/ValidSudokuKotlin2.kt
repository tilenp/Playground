package com.company.sudoku

object ValidSudokuKotlin2 {

    @JvmStatic
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val set = mutableSetOf<String>()
        for (row in board.indices) {
            for (column in board[row].indices) {
                val value = board[row][column]
                if (value == '.') {
                    continue
                }
                if (!set.add("row" + row + "value" + value) ||
                        !set.add("column" + column + "value" + value) ||
                        !set.add("square" + row / 3 + ":" + column / 3 + "value" + value)) {
                    return false
                }
            }
        }
        return true
    }
}