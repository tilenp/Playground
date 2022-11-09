package com.company.coderbyte.medium;

public class HexadecimalConverter {

    private static final char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void main(String[] args) {
        int num = 5;

        System.out.println(toHex(num));
        System.out.println(toHex1(num));
    }

    private static String toHex(int num) {
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }

    private static String toHex1(int num) {
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            result = map[num % 15] + result;
            num = (num >>> 4);
        }
        return result;
    }
}
