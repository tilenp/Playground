package com.company.coderbyte.medium;

public class BinaryConverter {

    //won't work if binary exceeds normal 8-bit length without spaces
    /*Using the JavaScript language, have the function BinaryConverter(str)
    return the decimal form of the binary value. For example:
    if 101 is passed return 5, or if 1000 is passed return 8. */

    public static void main(String[] args) {
//        String str = "101";
        String str = "1000";

        int result = binaryConverter(str);
        System.out.println(result);
    }

    private static int binaryConverter(String str) {
        int power = 0;
        int result = 0;
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == '1') {
                result += Math.pow(2, power);
            }
            power++;
        }
        return result;
    }
}
