package com.company.coderbyte.easy;

import java.util.Arrays;
import java.util.List;

public class LetterChanges {

    private static final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    private static String LetterChanges(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                char nextChar = (char) ((char) ((array[i] - 'a' + 1) % 26) + 'a');
                array[i] = nextChar;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (vowels.contains(array[i])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
//        String str = "hello*3";
        String str = "fun times!";

        String result = LetterChanges(str);
        System.out.println(result);
    }
}
