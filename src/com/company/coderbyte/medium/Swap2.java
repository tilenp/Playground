package com.company.coderbyte.medium;

public class Swap2 {


    /*Using the JavaScript language, have the function SwapII(str)
    take the str parameter and swap the case of each character.
    Then, if a letter is between two numbers (without separation),
    switch the places of the two numbers. For example: if str is "6Hello4 -8World, 7 yes3"
    the output should be 4hELLO6 -8wORLD, 7 YES3. */

    public static void main(String[] args) {
        String str = "6Hello4 -8World, 7 yes3";

        String result = SwapII(str);
        System.out.println(result);
    }

    private static String SwapII(String str) {
        char[] array = str.toCharArray();
        int previousDigitIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                if (Character.isLowerCase(array[i])) {
                    array[i] = Character.toUpperCase(array[i]);
                } else {
                    array[i] = Character.toLowerCase(array[i]);
                }
            } else if (Character.isDigit(array[i])) {
                if (previousDigitIndex != -1) {
                    swap(array, previousDigitIndex, i);
                }
                previousDigitIndex = i;
            } else if (array[i] == ' ') {
                previousDigitIndex = -1;
            }
        }
        return String.valueOf(array);
    }

    private static void swap(char[] array, int i, int k) {
        char temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
}
