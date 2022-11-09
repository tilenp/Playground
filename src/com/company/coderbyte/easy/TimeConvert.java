package com.company.coderbyte.easy;

public class TimeConvert {

    /*
    Have the function TimeConvert(num) take the num parameter being passed and
    return the number of hours and minutes the parameter converts to (ie. if num = 63
    then the output should be 1:3). Separate the number of hours and minutes with a colon.
     */

    public static void main(String[] args) {
        int num = 89;

        String result = TimeConvert(num);
        System.out.println(result);
    }

    private static String TimeConvert(int num) {
        int hours = num / 60;
        int minutes = num % 60;
        return hours + ":" + minutes;
    }
}
