package com.company.kotlin_examples

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

object FormattedDivision {

    /*Using the JavaScript language, have the function FormattedDivision(num1,num2)
    take both parameters being passed, divide num1 by num2, and return the result as a
    string with properly formatted commas and 4 significant digits after the decimal place.
    For example: if num1 is 123456789 and num2
    is 10000 the output should be "12,345.6789". The output must contain a number in the one's place even if it is a zero. */

    /*Using the JavaScript language, have the function FormattedDivision(num1,num2)
    take both parameters being passed, divide num1 by num2, and return the result as a
    string with properly formatted commas and 4 significant digits after the decimal place.
    For example: if num1 is 123456789 and num2
    is 10000 the output should be "12,345.6789". The output must contain a number in the one's place even if it is a zero. */
    @JvmStatic
    fun main(args: Array<String>) {
        val num1 = 123456789
        val num2 = 10000
        val result = FormattedDivision(num1, num2)
        println(result)
    }

    private fun FormattedDivision(num1: Int, num2: Int): String {
        // 0 – prints a digit if provided, 0 otherwise
        // # – prints a digit if provided, nothing otherwise
        val decimalFormat = DecimalFormat("#,###.0000")
        val customSymbol = DecimalFormatSymbols()
        customSymbol.groupingSeparator = ','
        customSymbol.decimalSeparator = '.'
        decimalFormat.decimalFormatSymbols = customSymbol

        // scale = 4 -> rounds result to 4 decimal points
        val factor = BigDecimal(num1.toString())
            .divide(BigDecimal(num2.toString()), 4, RoundingMode.HALF_UP)
        return decimalFormat.format(factor)
    }
}