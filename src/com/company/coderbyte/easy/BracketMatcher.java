package com.company.coderbyte.easy;

public class BracketMatcher {

    public static String BracketMatcher(String str) {
        int counter = 0;
        for (char current : str.toCharArray()) {
            if (current == '(') {
                counter++;
            } else if (current == ')') {
                counter--;
            }
        }
        return counter == 0 ? "1" : "0";
    }

    public static void main (String[] args) {
        String str = "(coder)(byte))";
//        String str = "(c(oder)) b(yte)";

        String result = BracketMatcher(str);
        System.out.println(result);
    }
}
