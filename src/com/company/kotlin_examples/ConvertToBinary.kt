package com.company.kotlin_examples

object ConvertToBinary {

    //won't work if binary exceeds normal 8-bit length without spaces
    /*Using the JavaScript language, have the function BinaryConverter(str)
    return the decimal form of the binary value. For example:
    if 101 is passed return 5, or if 1000 is passed return 8. */

    //won't work if binary exceeds normal 8-bit length without spaces
    /*Using the JavaScript language, have the function BinaryConverter(str)
    return the decimal form of the binary value. For example:
    if 101 is passed return 5, or if 1000 is passed return 8. */
    @JvmStatic
    fun main(args: Array<String>) {
//        String str = "101";
        val str = "1000"
        val result = binaryConverter(str)
        println(result)
    }

    private fun binaryConverter(str: String): Int {
        var power = 0
        var result = 0
        val array = str.toCharArray()
        for (i in array.indices.reversed()) {
            if (array[i] == '1') {
                result += Math.pow(2.0, power.toDouble()).toInt()
            }
            power++
        }
        return result
    }
}