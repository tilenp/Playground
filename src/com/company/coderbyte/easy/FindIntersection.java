package com.company.coderbyte.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIntersection {

    public static void main(String[] args) {
        String[] strArr = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        String result = FindIntersection(strArr);
        System.out.println(result);
    }

    public static String FindIntersection(String[] strArr) {
        String[] list1 = strArr[0].split(", ");
        String[] list2 = strArr[1].split(", ");

        Map<String, Integer> map = mapCharacter(list1);
        List<String> intersection = new ArrayList<>();
        for (String string : list2) {
            int frequency = map.getOrDefault(string, 0);
            if (frequency > 0) {
                intersection.add(string);
                map.put(string, frequency - 1);
            }
        }

        return String.join(",", intersection);
    }

    private static Map<String, Integer> mapCharacter(String[] strArr) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strArr) {
            int frequency = map.getOrDefault(string, 0);
            map.put(string, frequency + 1);
        }
        return map;
    }
}
