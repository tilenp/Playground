package com.company.kotlin_examples

import java.util.*

object RotateArrayToLeft {

    @JvmStatic
    fun main(args: Array<String>) {
        // 1,2,3,4,5
        // 5,4,3,2,1
        // 2,3,4,5,1
        val array = intArrayOf(1, 2, 3, 4, 5)
        val n = 1
        rotateArray(array, n)
        println(Arrays.toString(array))
    }

    private fun rotateArray(array: IntArray, n: Int) {
        reverse(array, 0, array.size - 1)
        reverse(array, 0, array.size - 1 - n)
        reverse(array, array.size - n, array.size - 1)
    }

    private fun reverse(array: IntArray, start: Int, end: Int) {
        var start = start
        var end = end
        while (start < end) {
            swap(array, start, end)
            start++
            end--
        }
    }

    private fun swap(array: IntArray, start: Int, end: Int) {
        val temp = array[start]
        array[start] = array[end]
        array[end] = temp
    }
}