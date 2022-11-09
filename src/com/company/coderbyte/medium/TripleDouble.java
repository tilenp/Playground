package com.company.coderbyte.medium;

import java.util.ArrayList;
import java.util.List;

public class TripleDouble {


    /*Using the JavaScript language, have the function TripleDouble(num1,num2)
    take both parameters being passed, and return 1 if there is a straight triple
    of a number at any place in num1 and also a straight double of the same number in num2.
    For example: if num1 equals 451999277 and num2 equals 41177722899, then return 1 because
    in the first parameter you have the straight triple 999 and you have a straight double,
    99, of the same number in the second parameter. If this isn't the case, return 0.*/

    public static void main(String[] args) {
        long num1 = 451999277L;
        long num2 = 41177722899L;

        boolean result = TripleDouble(num1, num2);
        System.out.println(result);
    }

    private static boolean TripleDouble(long num1, long num2) {
        List<Integer> triples = triples(num1);
        for (int digit : triples) {
            if (findDouble(num2, digit)) {
                return true;
            }
        }
        return false;
    }

    private static List<Integer> triples(long num) {
        List<Integer> list = new ArrayList<>();
        char[] array = String.valueOf(num).toCharArray();
        int value = 0;
        int count = 0;
        for (char current : array) {
            if (current - '0' == value) {
                count++;
                if (count == 3) {
                    list.add(current - '0');
                }
            } else {
                value = current - '0';
                count = 1;
            }
        }
        return list;
    }

    private static boolean findDouble(long num, int digit) {
        char[] array = String.valueOf(num).toCharArray();
        int count = 0;
        for (char current : array) {
            if (current - '0' == digit) {
                count++;
                if (count == 2) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
