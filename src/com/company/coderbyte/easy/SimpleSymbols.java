package com.company.coderbyte.easy;

public class SimpleSymbols {

    /*
     Simple Symbols                                                                      *
*  Using the JavaScript language, have the function SimpleSymbols(str) take the str    *
*  parameter being passed and determine if it is an acceptable sequence by either      *
*  returning the string true or false. The str parameter will be composed of + and =   *
*  symbols with several letters between them (ie. ++d+===+c++==a) and for the string   *
*  to be true each letter must be surrounded by a + symbol. So the string to the left  *
*  would be false. The string will not be empty and will have at least one letter.     *
     */

    public static void main(String[] args) {
//        String str = "+t+a+b+";
        String str = "++d+===+c++==a";

        String result = SimpleSymbols(str);
        System.out.println(result);
    }

    private static String SimpleSymbols(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char current = array[i];
            if (Character.isLetter(current)) {
                if (i == 0 || i == array.length - 1) {
                    return "false";
                }
                if (array[i - 1] != '+' || array[i + 1] != '+') {
                    return "false";
                }
            }
        }
        return "true";
    }
}
