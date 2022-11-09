package com.company.coderbyte.easy;

public class SimpleAdding {

    public static void main(String[] args) {
        int num = 4;

        int result = SimpleAdding(num);
        System.out.println(result);
    }

    private static int SimpleAdding(int num) {
        return num * (num + 1) / 2;
    }
}
