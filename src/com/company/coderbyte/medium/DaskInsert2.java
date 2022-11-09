package com.company.coderbyte.medium;

public class DaskInsert2 {

    //Works in every case but with zero, should be an easy fix
    /*Using the JavaScript language, have the function DashInsertII(str)
    insert dashes ('-') between each two odd numbers and insert asterisks ('*') between each two even numbers in str.
    For example: if str is 4546793 the output should be 454*67-9-3. Don't count zero as an odd or even number.*/

    public static void main(String[] args) {
        String str = "4546793";

        String result = DashInsertII(str);
        System.out.println(result);
    }

    private static String DashInsertII(String str) {
        StringBuilder builder = new StringBuilder();

        char[] array = str.toCharArray();
        for (int i = 0; i<array.length - 1; i++) {
            int current = array[i] - '0';
            int next = array[i + 1] - '0';
            builder.append(current);

            if (current == '0' || next == '0') {
                continue;
            }

            if (current % 2 == 0 && next % 2 == 0) {
                builder.append("*");
            } else if (current % 2 != 0 && next % 2 != 0){
                builder.append("-");
            }
        }

        // append the last digit
        builder.append(array[array.length - 1]);
        return builder.toString();
    }
}
