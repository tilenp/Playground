package com.company.coderbyte.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {

    // [abc]            a, b or c
    // [^abc]           any character except a,b or c
    // [a-z]            a to z
    // [a-zA-z]         a to z and A to Z
    // [0-9]            0 to 9

    // []?              0 or 1 time
    // []+              1 time
    // []*              0 or more times
    // []{n}            n times
    // []{n,}           n or more times
    // []{x,y}          at least x times but less than y times

    // \                escape operator (when searching for . + ?)


    /*
    examples
        starts with 8 or 9, contains 10 digits
        [89][0-9]{9}

        starts with an upper case contains lower case, only 1 digit allowed
        [A-Z][a-z]*[0-9][a-z]*

        email (characters, digits, _-. @ characters . 2-3 characters)
        [a-zA-Z0-9_\-\.][@][a-z][\.][a-z]{2,3}
     */

    /*
    1. The username is between 4 and 25 characters.
    2. It must start with a letter.
    3. It can only contain letters, numbers, and the underscore character.
    4. It cannot end with an underscore character.
     */

    public static void main(String[] args) {
//        String name = "aa_";
        String name = "u__hello_world123";

        String result = CodelandUsernameValidation(name);
        System.out.println(result);
    }

    public static String CodelandUsernameValidation(String str) {
        Pattern patter = Pattern.compile("[a-zA-Z]{1}[a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = patter.matcher(str);
        return matcher.matches() ? "true" : "false";
    }
}
