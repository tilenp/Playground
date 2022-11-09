package com.company.coderbyte.easy;

public class FirstReverse {

    public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String FirstReverse1(String str) {
        char[] array = str.toCharArray();
        reverse(array, 0, array.length - 1);
        return String.valueOf(array);
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    private static void swap(char[] array, int start, int end) {
        char temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }


    public static void main (String[] args) {
        String str = "I Love Code";

        String result = FirstReverse1(str);
        System.out.println(result);
    }
}
