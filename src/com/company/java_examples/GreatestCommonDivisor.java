package com.company.java_examples;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 16;

        int result = greatestCommonDivisor(num1, num2);
        System.out.println(result);
    }

    private static int greatestCommonDivisor(int num1, int num2) {
        // a = q * b + r
        // then gcd(a, b) = gcd(b, r)

        // loop till remainder is 0
        while (num2 > 0) {
            int reminder = num1 % num2; // remainder
            num1 = num2;
            num2 = reminder;
        }
        return num1;

    }

    private static int greatestCommonDivisorRecursive(int num1, int num2) {
        // a = x * b + c
        // then gcd(a, b) = gcd(b, c)

        if (num2 == 0) {
            return num1;
        }
        return greatestCommonDivisorRecursive(num2, num1 % num2);
    }
}
