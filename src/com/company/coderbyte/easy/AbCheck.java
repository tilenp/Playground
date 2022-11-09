package com.company.coderbyte.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbCheck {

    /*
     *  AB Check                                                                            *
     *  Using the JavaScript language, have the function ABCheck(str) take the str          *
     *  parameter being passed and return the string true if the characters a and b are     *
     *  separated by exactly 3 places anywhere in the string at least once                  *
     *  (ie. "lane borrowed" would result in true because there is exactly three characters *
     *  between a and b). Otherwise return the string false.
     */

    public static void main(String[] args) {
        String str = "lane borrowed";

        String result = ABCheck(str);
        System.out.println(result);
    }

//    private static String ABCheck(String str) {
//        char[] array = str.toCharArray();
//        for (int i = 0; i <= array.length - 4; i++) {
//            char currentChar = array[i];
//            int targetPosition = i + 4;
//            char targetChar = array[targetPosition];
//            if (currentChar == 'a' && targetChar == 'b' || currentChar == 'b' || targetChar == 'a') {
//                return "true";
//            }
//        }
//        return "false";
//    }

    private static String ABCheck(String str) {
        Pattern patter = Pattern.compile("/a...b/");
        Matcher matcher = patter.matcher(str);
        return matcher.find() ? "true" : "false";
    }
}
