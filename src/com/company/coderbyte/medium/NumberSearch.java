package com.company.coderbyte.medium;

public class NumberSearch {

    /*Using the JavaScript language, have the function NumberSearch(str) take the str parameter,
    search for all the numbers in the string, add them together, then return that final number
    divided by the total amount of letters in the string. For example: if str is "Hello6 9World 2, Nic8e D7ay!"
    the output should be 2. First if you add up all the numbers, 6 + 9 + 2 + 8 + 7 you get 32. Then there are 17
    letters in the string. 32 / 17 = 1.882, and the final answer should be rounded to the nearest whole number,
    so the answer is 2. Only single digit numbers separated by spaces will be used throughout
    the whole string (So this won't ever be the case: hello44444 world). Each string will also have at least one letter. */

    public static void main(String[] args) {
        String str = "Hello6 9World 2, Nic8e D7ay!";

        int result = NumberSearch(str);
        System.out.println(result);
    }

    private static int NumberSearch(String str) {
        double sum = 0;
        double charCount = 0;
        for (char current : str.toCharArray()) {
            if (Character.isDigit(current)) {
                sum += current - '0';
            } else if (Character.isLetter(current)) {
                charCount++;
            }
        }

        return (int) Math.round(sum / charCount);
    }
}
