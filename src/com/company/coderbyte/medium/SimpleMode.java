package com.company.coderbyte.medium;

import java.util.HashMap;
import java.util.Map;

public class SimpleMode {

    /*Using the JavaScript language, have the function SimpleMode(arr)
    take the array of numbers stored in arr and return the number that
    appears most frequently (the mode). For example: if arr contains
    [10, 4, 5, 2, 4] the output should be 4. If there is more than one
    mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5]
    should return 5 because it appeared first). If there is no mode return -1.
    The array will not be empty. */

    private static class Element {
        int index = Integer.MAX_VALUE;
        int value;
        int frequency;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 6, 5};

        int result = SimpleMode(arr);
        System.out.println(result);
    }

    private static int SimpleMode(int[] arr) {
        Map<Integer, Element> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Element element = map.getOrDefault(arr[i], new Element());
            element.index = Math.max(i, element.index);
            element.value = arr[i];
            element.frequency = element.frequency + 1;
            map.put(arr[i], element);
        }
        Element result = new Element();
        for (Map.Entry<Integer, Element> entry : map.entrySet()) {
            Element current = entry.getValue();
            if (current.frequency > result.frequency) {
                result = entry.getValue();
            } else if (entry.getValue().frequency == result.frequency && current.index < result.index) {
                result = entry.getValue();
            }
        }
        return result.value;
    }
}
