package com.company.lesson_3;

public class MissingElement {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5};

        int result = missingElement(array);
        System.out.println(result);
    }

    private static int missingElement(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        int n = array.length + 1; // + 1 because one element is missing
        int targetSum = (n * (n + 1)) / 2;
        return targetSum - sum;
    }
}
