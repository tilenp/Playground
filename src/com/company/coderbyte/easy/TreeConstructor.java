package com.company.coderbyte.easy;

import java.util.HashMap;
import java.util.Map;

public class TreeConstructor {

    public static String TreeConstructor(String[] strArr) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strArr) {
            String[] values = string.replaceAll("[^0-9,]", "").split(",");
            int children = map.getOrDefault(values[1], 0);
            if (children == 2) {
                return "false";
            }
            map.put(values[1], children + 1);
        }
        return "true";
    }

    public static void main(String[] args) {
        String[] strArr = new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
//        String[] strArr = new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"};

        String result = TreeConstructor(strArr);
        System.out.println(result);
    }
}
