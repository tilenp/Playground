package com.company.coderbyte.medium;

public class LetterCount {

    /*
     *  Letter Count I                                                                      *
     *  Have the function LetterCountI(str) take the str parameter being passed and return  *
     *  the first word with the greatest number of repeated letters. For example:           *
     *  "Today, is the greatest day ever!" should return greatest because it has 2 e's      *
     *  (and 2 t's) and it comes before ever which also has 2 e's. If there are no words    *
     *  with repeating letters return <b>-1</b>. Words will be separated by spaces.
     */

    public static void main(String[] args) {
        String str = "Today, is the greatest day ever!";

        String result = LetterCountI(str);
        System.out.println(result);
    }

    private static String LetterCountI(String str) {
        String[] words = str.replaceAll("[^a-zA-Z ]", "").split(" ");
        String result = "";
        int maxCount = 0;
        for (String word : words) {
            int count = maxRepeatedCharacters(word);
            if (count > maxCount) {
                result = word;
                maxCount = count;
            }
        }
        return result;
    }

    private static int maxRepeatedCharacters(String word) {
        int[] cache = new int[128];
        char[] array = word.toCharArray();
        for (char current : array) {
            cache[current]++;
        }

        int maxCount = 0;
        for (int count : cache) {
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
