package com.company.java_examples;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        fillPermutations(nums, used, new ArrayList<>(), result);
        return result;
    }

    private static void fillPermutations(int[] nums, boolean[] used, ArrayList<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            fillPermutations(nums, used, permutation, result);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }
    }
}
