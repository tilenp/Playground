package com.company.lesson_2;

public class OddOccurrencesInArray {

    // todo https://leetcode.com/problems/find-the-duplicate-number/
    // todo check common algorithms, read-write, BFS, DFS, Topological sort, binary search, combinations, permutations, DP - coins...
    // todo look into date format (Skyscanner)

    public static void main(String[] args) {
        int[] array = {9, 3, 9, 3, 9, 7, 9};

        int result = oddOccurrences(array);
        System.out.println(result);
    }

    private static int oddOccurrences(int[] array) {
        int result = 0;
        for (int value : array) {
            result ^= value;
        }
        return result;
    }
}
