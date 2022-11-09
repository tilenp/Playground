package com.company.kotlin_examples

import java.util.*

object IsPrime {

    @JvmStatic
    fun main(args: Array<String>) {
        val num = 5
        val result = isPrime(num)
        println(result)
    }

    private fun isPrime(num: Int): Boolean {
        // the first prime is 2
        if (num <= 1) {
            return false
        }
        val array = BooleanArray(num + 1)

        // 1 is not prime so fill from 2dn index
        Arrays.fill(array, 2, array.size, true)
        var i = 2
        while (i * i <= num) {

            // only loop primes
            if (array[i]) {
                var k = i
                while (k * i <= num) {
                    array[k * i] = false
                    k++
                }
            }
            i++
        }
        return array[num]
    }
}