package com.company.java_examples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FormattedDivision {

    /*Using the JavaScript language, have the function FormattedDivision(num1,num2)
    take both parameters being passed, divide num1 by num2, and return the result as a
    string with properly formatted commas and 4 significant digits after the decimal place.
    For example: if num1 is 123456789 and num2
    is 10000 the output should be "12,345.6789". The output must contain a number in the one's place even if it is a zero. */

    public static void main(String[] args) {
        int num1 = 123456789;
        int num2 = 10000;

        String result = FormattedDivision(num1, num2);
        System.out.println(result);
    }

    private static String FormattedDivision(int num1, int num2) {
        // 0 – prints a digit if provided, 0 otherwise
        // # – prints a digit if provided, nothing otherwise
        DecimalFormat decimalFormat = new DecimalFormat("#,###.0000");
        DecimalFormatSymbols customSymbol = new DecimalFormatSymbols();
        customSymbol.setGroupingSeparator(',');
        customSymbol.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(customSymbol);

        // scale = 4 -> rounds result to 4 decimal points
        BigDecimal factor =  new BigDecimal(String.valueOf(num1))
                .divide(new BigDecimal(String.valueOf(num2)), 4, RoundingMode.HALF_UP);
        return decimalFormat.format(factor);
    }
}
