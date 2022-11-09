package com.company.coderbyte.medium;

public class Division {

    /*
     * Have the function Division(num1,num2) take both parameters being passed and return the Greatest Common Factor.
     * That is, return the greatest number that evenly goes into both numbers with no remainder.
     * For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4.
     * The range for both parameters will be from 1 to 10^3.
     * @author Nick Livens
     */

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
