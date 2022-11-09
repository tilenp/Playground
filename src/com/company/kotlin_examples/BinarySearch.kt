package com.company.kotlin_examples

object BinarySearch {

    // Leetcode 704
    @JvmStatic
    fun main(args: Array<String>) {
        val nums = arrayOf(-1, 0, 3, 5, 9, 12)
        val target = 9
        val result = search(nums, target)
        println(result)
    }

    private fun search(nums: Array<Int>, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val middle = start + (end - start) / 2
            if (nums[middle] < target) {
                start = middle + 1
            } else if (nums[middle] > target) {
                end = middle - 1
            } else {
                return middle
            }
        }
        return -1
    }
}