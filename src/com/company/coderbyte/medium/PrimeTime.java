package com.company.coderbyte.medium;

import java.util.Arrays;

public class PrimeTime {

    /*
### Using the Python language, have the function PrimeTime(num) take the
###  num parameter being passed and return the string true if the parameter
### is a prime number, otherwise return the string false. The range will be
### between 1 and 2^16.
     */

    public static void main(String[] args) {
        int num = 4;

        boolean result = PrimeTime(num);
        System.out.println(result);
    }

    private static boolean PrimeTime(int num) {
        if (num < 2) {
            return false;
        }
        boolean[] array = new boolean[num + 1];
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
