package com.company.lesson_1;

public class BinaryGap {

    public static void main(String[] args) {
        int number = 1041; // 10000010001

        int result = gap(number);
        System.out.println(result);
    }

    private static int gap(int number) {
        char[] binaryArray = Integer.toBinaryString(number).toCharArray();
        int maxLength = 0;
        int counter = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == '1') {
                maxLength = Math.max(maxLength, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        return maxLength;
    }
}
