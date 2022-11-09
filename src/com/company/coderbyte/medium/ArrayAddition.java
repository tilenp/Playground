package com.company.coderbyte.medium;

import java.util.HashSet;
import java.util.Set;

public class ArrayAddition {

    /*
     *  Array Addition I                                                                    *
     *  Using the JavaScript language, have the function ArrayAdditionI(arr) take the array *
     *  of numbers stored in arr and return the string true if any combination of numbers   *
     *  in the array can be added up to equal the largest number in the array, otherwise    *
     *  return the string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the      *
     *  output should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty, *
     *  will not contain all the same elements, and may contain negative numbers.
     */

    // todo check combinations

    public static void main(String[] args) {
        int[] array = {4, 6, 23, 10, 1, 3};

        boolean result = ArrayAdditionI(array);
        System.out.println(result);
    }

    private static boolean ArrayAdditionI(int[] array) {
        int maxIndex = getMaxIndex(array);
        Set<Integer> skipSet = new HashSet<>();
        skipSet.add(maxIndex);
        return combinationExists(array, 0, 0, array[maxIndex], skipSet);
    }

    private static boolean combinationExists(int[] array, int start, int sum, int target, Set<Integer> skipSet) {
        if (sum == target) {
            return true;
        }
        for (int i = start; i < array.length; i++) {
            if (skipSet.contains(i)) {
                continue;
            }
            boolean result = combinationExists(array, i + 1, sum + array[i], target, skipSet);
            if (result) {
                return true;
            }
        }
        return false;
    }

    private static int getMaxIndex(int[] array) {
        int maxIndex = array[0];
        for (int i = 1; i<array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
