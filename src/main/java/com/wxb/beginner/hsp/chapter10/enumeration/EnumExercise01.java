package com.wxb.beginner.hsp.chapter10.enumeration;

/**
 * @author alex
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        System.out.println("===所有星期信息如下===");
        for (Week w:
             Week.values()) {
            System.out.println(w);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
