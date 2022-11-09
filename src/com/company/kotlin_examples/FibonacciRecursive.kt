package com.company.kotlin_examples

object FibonacciRecursive {

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 5
        val result = fib(n)
        println(result)
    }

    private fun fib(n: Int): Int {
        val cache = IntArray(n + 1)
        return fib(n, cache)
    }

    private fun fib(n: Int, cache: IntArray): Int {
        if (n == 0) {
            return 0
        }
        if (n == 1) {
            return 1
        }
        if (cache[n] == 0) {
            cache[n] = fib(n - 1, cache) + fib(n - 2, cache)
        }
        return cache[n]
    }

    private fun fib1(n: Int): Int {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
}