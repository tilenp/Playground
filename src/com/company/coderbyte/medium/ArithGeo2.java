package com.company.coderbyte.medium;

public class ArithGeo2 {

    /*Have the function ArithGeoII(arr) take the array of numbers stored in arr and return the
string "Arithmetic" if the sequence follows an arithmetic pattern or return "Geometric" if
it follows a geometric pattern. If the sequence doesn't follow either pattern return -1.
An arithmetic sequence is one where the difference between each of the numbers is consistent,
where as in a geometric sequence, each term after the first is multiplied by some constant
or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
Negative numbers may be entered as parameters, 0 will not be entered, and no array will
contain all the same elements.*/

    public static void main(String[] args) {
//        int[] array = {2, 4, 6, 8};
        int[] array = {2, 6, 18, 54};

        String result = ArithGeoII(array);
        System.out.println(result);
    }

    private static String ArithGeoII(int[] array) {
        if (isArithmetic(array)) {
            return "Arithmetic";
        } else if (isGeometric(array)) {
            return "Geometric";
        } else return "-1";
    }

    private static boolean isArithmetic(int[] array) {
        int difference = Math.abs(array[1] - array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - array[i - 1]) != difference) {
                return false;
            }
        }
        return true;
    }

    private static boolean isGeometric(int[] array) {
        int factor = array[1] / array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] / array[i - 1] != factor) {
                return false;
            }
        }
        return true;
    }
}
