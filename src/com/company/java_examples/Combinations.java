package com.company.java_examples;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        List<List<Integer>> result = combine(4, 2);
        System.out.println(result);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        fillCombination(n, 1, k, new ArrayList<>(), list);
        return list;
    }

    private static void fillCombination(int n, int start, int k, ArrayList<Integer> combination, List<List<Integer>> result) {
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i <= n; i++) {
            combination.add(i);
            fillCombination(n, i + 1, k, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}
