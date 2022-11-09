package com.company.coderbyte.medium;

public class RunLength {

    /*
    compress string wwwgg -> 3w2g
     */

    public static void main(String[] args) {
        String str = "wwwggc";

        String result = compress(str);
        System.out.println(result);
    }

    private static String compress(String str) {
        StringBuilder builder = new StringBuilder();
        char[] array = str.toCharArray();
        int counter = 0;
        int start = 0;
        for (int end = 0; end < array.length; end++) {
            if (array[start] != array[end]) {
                builder.append(counter).append(array[start]);
                start = end;
                counter = 1; // 1 because end is already on the next character
            } else {
                counter++;
            }
        }
        // compress the last character
        builder.append(counter).append(array[start]);
        return builder.toString();
    }
}
