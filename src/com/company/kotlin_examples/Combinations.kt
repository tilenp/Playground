package com.company.kotlin_examples

object Combinations {

    @JvmStatic
    fun main(args: Array<String>) {
        val result = combine(4, 2)
        println(result)
    }

    fun combine(n: Int, k: Int): List<List<Int>> {
        val list: MutableList<List<Int>> = ArrayList()
        fillCombination(n, 1, k, ArrayList(), list)
        return list
    }

    private fun fillCombination(
        n: Int,
        start: Int,
        k: Int,
        combination: ArrayList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (combination.size == k) {
            result.add(ArrayList(combination))
            return
        }
        for (i in start..n) {
            combination.add(i)
            fillCombination(n, i + 1, k, combination, result)
            combination.removeAt(combination.size - 1)
        }
    }
}