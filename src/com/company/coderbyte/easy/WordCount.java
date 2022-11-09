package com.company.coderbyte.easy;

public class WordCount {

    /*
     *  Word Count                                                                          *
     *  Using the JavaScript language, have the function WordCount(str) take the str        *
     *  string parameter being passed and return the number of words the string contains    *
     *  (ie. "Never eat shredded wheat" would return 4). Words will be separated by single  *
     *  spaces.
     */

    public static void main(String[] args) {
        String str = "Never eat shredded wheat";

        int result = WordCount(str);
        System.out.println(result);
    }

    private static int  WordCount(String str) {
        return str.split(" ").length;
    }
}
