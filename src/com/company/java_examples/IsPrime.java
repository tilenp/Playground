package com.company.java_examples;

import java.util.Arrays;

public class IsPrime {

    public static void main(String[] args) {
        int num = 5;

        boolean result = isPrime(num);
        System.out.println(result);
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
}
