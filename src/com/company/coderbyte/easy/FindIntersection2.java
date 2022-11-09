package com.company.coderbyte.easy;

import java.util.*;
import java.util.stream.Collectors;

public class FindIntersection2 {

    public static void main(String[] args) {
        String[] strArr = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        String result = FindIntersection(strArr);
        System.out.println(result);
    }

    public static String FindIntersection(String[] strArr) {
        List<Integer> list1 = toIntegerList(strArr[0]);
        List<Integer> list2 = toIntegerList(strArr[1]);
        List<Integer> intersection = intersection(list1, list2);

        List<String> stringList = intersection.stream().map(Object::toString).collect(Collectors.toList());
//        List<String> stringList = intersection.stream().map(value -> value.toString()).collect(Collectors.toList());

        return String.join(",", stringList);
    }

    private static List<Integer> toIntegerList(String stringList) {
        return Arrays
                .stream(stringList.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersection = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            int value1 = list1.get(index1);
            int value2 = list2.get(index2);
            if (value1 < value2) {
                index1++;
            } else if (value2 < value1) {
                index2++;
            } else {
                intersection.add(value1);
                index1++;
                index2++;
            }
        }
        return intersection;
    }
}
