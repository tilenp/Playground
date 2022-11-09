package com.company.kotlin_examples

import java.util.*

object ReadWrite {

    // Leetcode 283
    @JvmStatic
    fun main(args: Array<String>) {
        val nums = arrayOf(0, 1, 0, 3, 12)
        moveZeroes(nums)
        println(Arrays.toString(nums))
    }

    fun moveZeroes(nums: Array<Int>) {
        var write = 0
        for (read in nums.indices) {
            if (nums[read] != 0) {
                nums[write] = nums[read]
                write++
            }
        }
        while (write < nums.size) {
            nums[write] = 0
            write++
        }
    }
}