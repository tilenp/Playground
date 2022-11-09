package com.company.coderbyte.medium;

import java.util.Locale;

public class PalindromeTwo {


/*Using the JavaScript language, have the function PalindromeTwo(str)
take the str parameter being passed and return the string true if the parameter is a palindrome,
(the string is the same forward as it is backward) otherwise return the string false.
The parameter entered may have punctuation and symbols but they should not affect whether the string is in fact a palindrome.
For example: "Anne, I vote more cars race Rome-to-Vienna" should return true. */

    public static void main(String[] args) {
        String str = "Anne, I vote more cars race Rome-to-Vienna";

        boolean result = isPalindrome(str);
        System.out.println(result);
    }

    private static boolean isPalindrome(String str) {
        String string = str.replaceAll("[^a-zA-Z]", "");
        return checkPalindrome(string.toLowerCase(Locale.ROOT));
    }

    private static boolean checkPalindrome(String string) {
        int length = string.length();
        char[] array = string.toCharArray();
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
