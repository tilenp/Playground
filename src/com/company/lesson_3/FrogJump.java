package com.company.lesson_3;

public class FrogJump {

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        int result = numberOfJumps(X, Y, D);
        System.out.println(result);
    }

    private static int numberOfJumps(int x, int y, int d) {
        int difference = y - x;
        return (int) Math.ceil(difference / (float) d);
    }
}
