package com.company.kotlin_examples

import java.util.regex.Pattern

object NameValidationRegex {

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
    @JvmStatic
    fun main(args: Array<String>) {
//        String name = "aa_";
        val name = "u__hello_world123"
        val result = CodelandUsernameValidation(name)
        println(result)
    }

    fun CodelandUsernameValidation(str: String?): String {
        val patter = Pattern.compile("[a-zA-Z]{1}[a-zA-Z0-9_]{2,23}[^_]")
        val matcher = patter.matcher(str)
        return if (matcher.matches()) "true" else "false"
    }
}