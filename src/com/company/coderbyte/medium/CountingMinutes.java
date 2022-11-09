package com.company.coderbyte.medium;

public class CountingMinutes {

    /*
     *  Counting Minutes I                                                                  *
     *  Using the JavaScript language, have the function CountingMinutesI(str) take the     *
     *  str parameter being passed which will be two times (each properly formatted with    *
     *  a colon and am or pm) separated by a hyphen and return the total number of minutes  *
     *  between the two times. The time will be in a 12 hour clock format. For example:     *
     *  if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am     *
     *  the output should be 1320.                                                          *
     */

    public static void main(String[] args) {
//        String str = "9:00am-10:00am";
        String str = "1:00pm-11:00am";

        int result = CountingMinutesI(str);
        System.out.println(result);
    }

    private static int CountingMinutesI(String str) {
        String[] times = str.split("-");

        // if time is negative add another day of minutes
        int difference = getMinutes(times[1]) - getMinutes(times[0]);
        return difference >= 0 ? difference : difference + 24 * 60;
    }

    private static int getMinutes(String str) {
        boolean containsPm = str.contains("pm");
        String[] hourMinute = str.replaceAll("[a-z]", "").split(":");
        int minutes = 0;
        minutes += Integer.parseInt(hourMinute[0]) * 60;
        minutes += Integer.parseInt(hourMinute[1]);
        if (containsPm) {
            minutes += 12 * 60;
        }
        return minutes;
    }
}
