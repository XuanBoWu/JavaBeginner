package com.wxb.beginner.chapter10;

public class finalDetail {
    public static void main(String[] args) {
        System.out.println(new FinalExercise01().circleArea(12));
    }
}

class FinalExercise01 {
    public final double PI = 3.14;

    {
        //PI = 3.14;
    }

    public FinalExercise01() {
        //PI = 3.14;
    }

    public double circleArea(final double r) {
        return PI * r * r;
    }


}
