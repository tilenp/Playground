package com.company.coderbyte.medium;

public class StringScramble {

    /*
    #  Using the Python language, have the function StringScramble(str1,str2) take both parameters being passed and return
    # the string true if a portion of str1 characters can be rearranged to match str2, otherwise return the string false.
    # For example: if str1 is "rkqodlw" and str2 is "world" the output should return true. Punctuation and symbols will
    # not be entered with the parameters.
     */

    public static void main(String[] args) {
        String str1 = "rkqodlw";
        String str2 = "world";

        boolean result = isSubset(str1, str2);
        System.out.println(result);
    }

    private static boolean isSubset(String str1, String str2) {
        int[] cache1 = getCache(str1);
        int[] cache2 = getCache(str2);
        for (int i = 0; i < 26; i++) {
            if (cache1[i] < cache2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] getCache(String str) {
        int[] cache = new int[26];
        for (char current : str.toCharArray()) {
            cache[current - 'a']++;
        }
        return cache;
    }
}
