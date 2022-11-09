package com.company.coderbyte.medium;

public class StringReduction {

    /*
    Have the function StringReduction(str) take the str parameter being passed and return
    the smallest number you can get through the following reduction method. The method is:
    Only the letters a, b, and c will be given in str and you must take two different
    adjacent characters and replace it with the third. For example "ac" can be replaced
    with "b" but "aa" cannot be replaced with anything. This method is done repeatedly
    until the string cannot be further reduced, and the length of the resulting string
    is to be outputted. For example: if str is "cab", "ca" can be reduced to "b" and you
    get "bb" (you can also reduce it to "cc"). The reduction is done so the output should be 2.
    If str is "bcab", "bc" reduces to "a", so you have "aab", then "ab" reduces to "c",
    and the final string "ac" is reduced to "b" so the output should be 1.
     */

    public static void main(String[] args) {
//        String str = "cab";
        String str = "bcab";

        int result = StringReduction(str);
        System.out.println(result);
    }

    public static int StringReduction(String str) {
        boolean compress = true;
        while (compress) {
            compress = false;
            char[] array = str.toCharArray();
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i - 1]) {
                    str = str.substring(0, i - 1) +
                            replacementChar(array[i], array[i-1]) +
                            str.substring(i + 1);
                    compress = true;
                    break;
                }
            }
        }
        return str.length();
    }

    private static char replacementChar(char char1, char char2) {
        // todo fix
        return (char) (((char1 - 'a') + (char2 - 'a') + 1) % 3 + 1 + 'a');
    }
}
