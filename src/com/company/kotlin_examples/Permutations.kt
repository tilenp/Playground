package com.company.kotlin_examples

object Permutations {

    @JvmStatic
    fun main(args: Array<String>) {
        val nums = arrayOf(1, 2, 3)
        val result = permute(nums)
        println(result)
    }

    fun permute(nums: Array<Int>): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        val used = BooleanArray(nums.size)
        fillPermutations(nums, used, ArrayList(), result)
        return result
    }

    private fun fillPermutations(
        nums: Array<Int>,
        used: BooleanArray,
        permutation: ArrayList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (permutation.size == nums.size) {
            result.add(ArrayList(permutation))
            return
        }
        for (i in nums.indices) {
            if (used[i]) {
                continue
            }
            used[i] = true
            permutation.add(nums[i])
            fillPermutations(nums, used, permutation, result)
            permutation.removeAt(permutation.size - 1)
            used[i] = false
        }
    }
}