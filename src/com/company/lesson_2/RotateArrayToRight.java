package com.company.lesson_2;

import java.util.Arrays;

public class RotateArrayToRight {

    public static void main(String[] args) {
        // 1,2,3,4,5
        // 5,4,3,2,1
        // 5,1,2,3,4
        int[] array = {1, 2, 3, 4, 5};
        int n = 1;

        rotateArray(array, n);
        System.out.println(Arrays.toString(array));
    }

    private static void rotateArray(int[] array, int n) {
        reverse(array, 0, array.length - 1);
        reverse(array, 0, n - 1);
        reverse(array, n, array.length -1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
