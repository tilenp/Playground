package com.company.coderbyte.medium;

import java.util.*;

public class PrimeChecker {

    /*
    # Using the Python language, have the function PrimeChecker(num) take num
    and return 1 if any arrangement of num comes out to be a prime number,
    otherwise return 0. For example: if num is 910, the output should be 1
    because 910 can be arranged into 109 or 019, both of which are primes.
     */

    public static void main(String[] args) {
        int num = 910;

        int result = PrimeChecker(num);
        System.out.println(result);
    }

    private static int PrimeChecker(int num) {
        int max = getMax(num);
        boolean[] primes = getPrimesArray(max);
        List<Integer> permutations = permute(String.valueOf(num).toCharArray());
        for (int permutation : permutations) {
            if (primes[permutation]) {
                return 1;
            }
        }
        return 0;
    }

    private static int getMax(int num) {
        char[] array = String.valueOf(num).toCharArray();
        Arrays.sort(array);
        String maxString = new StringBuilder(String.valueOf(array)).reverse().toString();
        return Integer.parseInt(maxString);
    }

    private static boolean[] getPrimesArray(int num) {
        // the first prime is 2
        if (num <= 1) {
            return new boolean[num + 1];
        }
        boolean[] array = new boolean[num + 1];

        // 1 is not prime so fill from 2dn index
        Arrays.fill(array, 2, array.length, true);

        for (int i = 2; i * i <= num; i++) {
            // only loop primes
            if (array[i]) {
                for (int k = i; k * i <= num; k++) {
                    array[k * i] = false;
                }
            }
        }
        return array;
    }

    public static List<Integer> permute(char[] array) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[array.length];
        fillPermutations(array, used, new StringBuilder(), result);
        return result;
    }

    private static void fillPermutations(char[] nums, boolean[] used, StringBuilder permutation, List<Integer> result) {
        if (permutation.length() == nums.length) {
            result.add(Integer.parseInt(permutation.toString()));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            permutation.append(nums[i]);
            fillPermutations(nums, used, permutation, result);
            permutation.deleteCharAt(permutation.length() - 1);
            used[i] = false;
        }
    }
}
