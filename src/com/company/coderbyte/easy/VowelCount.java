package com.company.coderbyte.easy;

import java.util.Arrays;
import java.util.List;

public class VowelCount {

    /*
     *  Vowel Count                                                                         *
     *  Using the JavaScript language, have the function VowelCount(str) take the str       *
     *  string parameter being passed and return the number of vowels the string contains   *
     *  (ie. "All cows eat grass" would return 5). Do not count y as a vowel for this       *
     *  challenge.
     */

    private static final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        String str = "All cows eat grass";

        int result = VowelCount(str);
        System.out.println(result);
    }

    private static int VowelCount(String str) {
        int count = 0;
        for (char current : str.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(current))) {
                count++;
            }
        }
        return count;
    }
}
