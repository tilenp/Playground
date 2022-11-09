package com.company.coderbyte.easy;

public class LongestWord {

    public static void main(String[] args) {
//        String sen = "fun&!! time";
        String sen = "I love dogs";

        String result = LongestWord(sen);
        System.out.println(result);
    }

    public static String LongestWord(String sen) {
        int indexStart = 0;
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < sen.length(); end++) {
            char current = sen.charAt(end);
            if (Character.isLetter(current) || Character.isDigit(current)) {
                int length = end - start + 1;
                if (length > maxLength) {
                    indexStart = start;
                    maxLength = length;
                }
            } else {
                start = end + 1;
            }
        }
        return sen.substring(indexStart, indexStart + maxLength);
    }
}
