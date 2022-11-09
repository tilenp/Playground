package com.company.coderbyte.easy;

import java.util.Arrays;

public class AlphabetSoup {

    /*
     *  Alphabet Soup                                                                       *
     *  Have the function AlphabetSoup(str) take the str string parameter being passed      *
     *  and return the string with the letters in alphabetical order                        *
     *  (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be       *
     *  included in the string.
     */

    public static void main(String[] args) {
        String str = "hello";

        String result = AlphabetSoup(str);
        System.out.println(result);
    }

    private static String AlphabetSoup(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);
    }
}
