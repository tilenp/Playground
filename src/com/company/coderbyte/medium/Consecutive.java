package com.company.coderbyte.medium;

public class Consecutive {

    /**
     * Have the function Consecutive(arr) take the array of integers stored in arr and return the minimum number of
     * integers needed to make the contents of arr consecutive from the lowest number to the highest number.
     * For example: If arr contains [4, 8, 6] then the output should be 2 because two numbers need to be added to the
     * array (5 and 7) to make it a consecutive array of numbers from 4 to 8.
     * Negative numbers may be entered as parameters and no array will have less than 2 elements.
     *
     * @author Nick Livens
     */

    public static void main(String[] args) {
        int[] arr = {4, 8, 6};

        int result = Consecutive(arr);
        System.out.println(result);
    }

    private static int Consecutive(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        int targetLength = max - min + 1;
        return targetLength - arr.length;
    }
}
