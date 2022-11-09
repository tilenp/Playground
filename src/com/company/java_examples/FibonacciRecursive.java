package com.company.java_examples;

public class FibonacciRecursive {

    public static void main(String[] args) {
        int n = 5;

        int result = fib(n);
        System.out.println(result);
    }

    private static int fib(int n) {
        int[] cache = new int[n + 1];
        return fib(n, cache);
    }

    private static int fib(int n, int[] cache) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (cache[n] == 0) {
            cache[n] = fib(n - 1, cache) + fib(n - 2, cache);
        }
        return cache[n];
    }

//    private static int fib1(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return fib1(n - 1) + fib1(n - 2);
//    }
}
