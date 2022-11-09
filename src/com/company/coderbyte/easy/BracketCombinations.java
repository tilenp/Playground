package com.company.coderbyte.easy;

import java.util.HashMap;
import java.util.Map;

public class BracketCombinations {

    public static int BracketCombinations(int num) {
        Map<Integer, Integer> cache = new HashMap<>();
        return BracketCombinations(num, num, cache);
    }

    private static int BracketCombinations(int open, int closed, Map<Integer, Integer> cache) {
        if (open == 0 && closed == 0) {
            return 1;
        }
        int combinations = 0;
        if (open > 0) {
            combinations += BracketCombinations(open - 1, closed, cache);
        }
        if (closed > 0 && open < closed) {
            combinations += BracketCombinations(open, closed - 1, cache);
        }
        return combinations;
    }

    public static void main (String[] args) {
        int num = 2;

        int result = BracketCombinations(num);
        System.out.println(result);
    }
}
