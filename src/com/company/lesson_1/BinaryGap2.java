package com.company.lesson_1;

public class BinaryGap2 {

    public static void main(String[] args) {
        int number = 1041; // 10000010001

        int result = gap(number);
        System.out.println(result);
    }

    private static int gap(int number) {
        char[] binaryArray = Integer.toBinaryString(number).toCharArray();
        int longestDistance = 0;
        int start = -1;
        for (int end = 0; end < binaryArray.length; end++) {
            if (binaryArray[end] == '1') {
                int distance = start == -1 ? 0 : end - start;
                longestDistance = Math.max(longestDistance, distance);
                start = end;
            }
        }
        return longestDistance;
    }
}
