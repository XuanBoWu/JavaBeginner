package com.wxb.beginner.chapter10.enumeration;

/**
 * @author alex
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {

        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}

enum SeasonForEnum {
    SPRING("Spring", "Warmth"),
    SUMMER("Summer", "Hot"),
    AUTUMN("Autumn", "Cool"),
    WINTER("Winter", "Cold");

    private String name;
    private String desc;

    SeasonForEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}