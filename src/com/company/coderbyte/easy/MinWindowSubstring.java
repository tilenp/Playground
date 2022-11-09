package com.company.coderbyte.easy;

public class MinWindowSubstring {

    public static String MinWindowSubstring(String[] strArr) {
        String string = strArr[0];
        String target = strArr[1];

        int[] targetCache = cacheCharacters(target);
        int[] stringCache = new int[26];
        int foundCharacters = 0;
        int start = 0;
        int startAns = 0;
        int lengthAns = Integer.MAX_VALUE;
        for (int end = 0; end < string.length(); end++) {
            char current = string.charAt(end);

            // found a new character in target
            if (stringCache[current - 'a'] < targetCache[current - 'a']) {
                foundCharacters++;
            }
            stringCache[current - 'a']++;

            // while we have all target characters, move start
            while (start < end && stringCache[string.charAt(start) - 'a'] > targetCache[string.charAt(start) - 'a']) {
                stringCache[string.charAt(start) - 'a']--;
                start++;
            }

            // if we have all characters and length is smaller
            int length = end - start + 1;
            if (foundCharacters == target.length() && length < lengthAns) {
                startAns = start;
                lengthAns = length;
            }
        }
        return string.substring(startAns, startAns + lengthAns);
    }

    private static int[] cacheCharacters(String string) {
        int[] cache = new int[26];
        for (char current : string.toCharArray()) {
            cache[current - 'a']++;
        }
        return cache;
    }

    public static void main(String[] args) {
//        String[] strArr = new String[]{"ahffaksfajeeubsne", "jefaa"};
        String[] strArr = new String[]{"aaffhkksemckelloe", "fhea"};

        String result = MinWindowSubstring(strArr);
        System.out.println(result);
    }
}
