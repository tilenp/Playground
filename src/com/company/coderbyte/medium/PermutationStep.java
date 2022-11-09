package com.company.coderbyte.medium;

import java.util.Arrays;

public class PermutationStep {

    /*
    Have the function PermutationStep(num) take the num
    parameter being passed and return the next number
    greater than num using the same digits. For example:
    if num is 123 return 132, if it's 12453 return 12534.
    If a number has no greater permutations, return -1 (ie. 999).
     */

    public static void main(String[] args) {
//        int num = 123;
        int num = 12453;

        int result = PermutationStep(num);
        System.out.println(result);
    }

    private static int PermutationStep(int num) {
        char[] array = String.valueOf(num).toCharArray();
        int pivotIndex = pivotIndex(array);

        // there is no greater permutation
        if (pivotIndex == -1) {
            return -1;
        }

        // swap pivot with previous
        swap(array, pivotIndex, pivotIndex + 1);
        Arrays.sort(array, pivotIndex + 1, array.length);
        return Integer.parseInt(String.valueOf(array));
    }

    private static void swap(char[] array, int i, int k) {
        char temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    private static int pivotIndex(char[] array) {
        int index = array.length - 2;
        while (index >= 0) {
            if (array[index] < array[index + 1]) {
                return index;
            }
            index--;
        }
        return index;
    }
}
