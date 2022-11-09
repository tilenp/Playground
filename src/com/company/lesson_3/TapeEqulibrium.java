package com.company.lesson_3;

public class TapeEqulibrium {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4, 3};

        int result = minDifference(array);
        System.out.println(result);
    }

    private static int minDifference(int[] array) {
        int rightSum = 0;
        for (int value : array) {
            rightSum += value;
        }

        int minDifference = Integer.MAX_VALUE;
        int leftSum = 0;
        for (int value : array) {
            leftSum += value;
            rightSum -= value;
            int difference = Math.abs(leftSum - rightSum);
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }
}
