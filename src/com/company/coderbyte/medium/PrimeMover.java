package com.company.coderbyte.medium;

import java.util.Arrays;

public class PrimeMover {

    /*
    Using the JavaScript language, have the function PrimeMover(num) return the numth prime number.
    The range will be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is
    the 16th prime number.
    */

    public static void main(String[] args) {
        int num = 16;

        int result = getNthPrime(num);
        System.out.println(result);
    }

    private static int getNthPrime(int num) {
        int currentValue = 2;
        while (true) {
            // decrement num if a new prime is found
            if (isPrime(currentValue)) {
                num--;
            }

            // nth prime is found
            if (num == 0) {
                return currentValue;
            }
            currentValue++;
        }
    }

    private static boolean isPrime(int num) {
        // the first prime is 2
        if (num <= 1) {
            return false;
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
        return array[num];
    }

//    private static int getNthPrime(int num) {
//        int length = 10000;
//        boolean[] array = new boolean[length + 1];
//
//        // 1 is not prime so fill from 2dn index
//        Arrays.fill(array, 2, array.length, true);
//
//        for (int i = 2; i * i <= length; i++) {
//            // only loop primes
//            if (array[i]) {
//                for (int k = i; k * i <= length; k++) {
//                    array[k * i] = false;
//                }
//            }
//        }
//
//        // find nth prime
//        for (int i = 0; i < length; i++) {
//
//            // if i is prime
//            if (array[i]) {
//                num--;
//            }
//
//            // nth prime found
//            if (num == 0) {
//                return i;
//            }
//        }
//
//        throw new IllegalArgumentException("element too big");
//    }
}
