package com.company.coderbyte.easy;

public class QuestionsMarks {

    public static void main(String[] args) {
//        String str = "arrb6???4xxbl5???eee5";
        String str = "acc?7??sss?3rr1??????5";
//        String str = "aa6?95???5";

        String result = QuestionsMarks(str);
        System.out.println(result);
    }

    public static String QuestionsMarks(String str) {
        String result = "false";
        int n = str.length();
        char[] chars = str.toCharArray();
        for (int start = 0; start < n; start++) {
            char charStart = chars[start];
            if (Character.isDigit(charStart)) {
                int count = 0;
                for (int end = start + 1; end < n; end++) {
                    char charEnd = chars[end];
                    if (chars[end] == '?') {
                        count++;
                    } else if(Character.isDigit(charEnd)){
                        int sum = (charStart - '0') + (charEnd - '0');
                        if (sum == 10) {
                            if (count != 3) {
                                return "false"; // count is not 3
                            } else {
                                result = "true"; // cache result exists
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
