package com.company.coderbyte.easy;

public class FirstFactorial {

    // factorial of a negative number is undefined

    public static int FirstFactorial(int num) {
        if (num <= 1) {
            return num;
        }
        // code goes here
        return num * FirstFactorial(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;

        int result = FirstFactorial(num);
        System.out.println(result);
    }
}
