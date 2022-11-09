package com.company.kotlin_examples

object GreatestCommonDivisor {

    @JvmStatic
    fun main(args: Array<String>) {
        val num1 = 12
        val num2 = 16
        val result = greatestCommonDivisor(num1, num2)
        println(result)
    }

    private fun greatestCommonDivisor(num1: Int, num2: Int): Int {
        // a = q * b + r
        // then gcd(a, b) = gcd(b, r)

        // loop till remainder is 0
        var num1 = num1
        var num2 = num2
        while (num2 > 0) {
            val reminder = num1 % num2 // remainder
            num1 = num2
            num2 = reminder
        }
        return num1
    }

    private fun greatestCommonDivisorRecursive(num1: Int, num2: Int): Int {
        // a = x * b + c
        // then gcd(a, b) = gcd(b, c)
        return if (num2 == 0) {
            num1
        } else greatestCommonDivisorRecursive(num2, num1 % num2)
    }
}