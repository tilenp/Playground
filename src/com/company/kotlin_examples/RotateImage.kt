package com.company.kotlin_examples

import java.util.*

object RotateImage {

    @JvmStatic
    fun main(args: Array<String>) {
        val matrix = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
        rotate(matrix)
        for (row in matrix) {
            println(Arrays.toString(row))
        }
    }

    fun rotate(matrix: Array<Array<Int>>) {
        transpose(matrix)
        flipHorizontally(matrix)
    }

    private fun transpose(matrix: Array<Array<Int>>) {
        for (row in matrix.indices) {
            for (column in row until matrix[row].size) {
                swap(matrix, row, column, column, row)
            }
        }
    }

    private fun flipHorizontally(matrix: Array<Array<Int>>) {
        for (row in matrix.indices) {
            for (column in 0 until matrix[row].size / 2) {
                swap(matrix, row, column, row, matrix[row].size - 1 - column)
            }
        }
    }

    private fun swap(matrix: Array<Array<Int>>, row1: Int, column1: Int, row2: Int, column2: Int) {
        val temp = matrix[row1][column1]
        matrix[row1][column1] = matrix[row2][column2]
        matrix[row2][column2] = temp
    }
}