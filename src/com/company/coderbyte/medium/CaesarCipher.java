package com.company.coderbyte.medium;

public class CaesarCipher {

    /*Using the JavaScript language, have the function CaesarCipher(str,num)
    take the str parameter and perform a Caesar Cipher shift on it using the num
    parameter as the shifting number. A Caesar Cipher works by shifting each letter
    in the string N places down in the alphabet (in this case N will be num).
    Punctuation, spaces, and capitalization should remain intact.
    For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt"*/

    public static void main(String[] args) {
        String str = "Caesar Cipher";
        int num = 2;

        String result = CaesarCipher(str,num);
        System.out.println(result);
    }

    private static String CaesarCipher(String str, int num) {
        char[] array = str.toCharArray();
        for (int i = 0; i<array.length; i++) {
            char current = array[i];

            if (Character.isLetter(current)) {
                if (Character.isLowerCase(current)) {
                    array[i] = (char) (((current - 'a' + num) % 26) + 'a');
                } else {
                    array[i] = (char) (((current - 'A' + num) % 26) + 'A');
                }
            }
        }
        return String.valueOf(array);
    }
}
