package com.company.coderbyte.easy;

public class LetterCapitalize {

    public static void main(String[] args) {
//        String str = "hello world";
        String str = "I ran here";

        String result = LetterCapitalize(str);
        System.out.println(result);
    }

    private static String LetterCapitalize(String str) {
        boolean capitalize = true;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (capitalize) {
                array[i] = Character.toUpperCase(array[i]);
                capitalize = false;
            } else if (array[i] == ' ') {
                capitalize = true;
            }
        }
        return String.valueOf(array);
    }
}
