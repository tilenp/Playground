package com.company.java_examples;

public class Fibonacci {

    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }

    public static int fib(int n) {
        int first = 0;
        int second = 1;
        while (n > 0) {
            int temp = first;
            first = second;
            second += temp;
            n--;
        }
        return first;
    }
}
