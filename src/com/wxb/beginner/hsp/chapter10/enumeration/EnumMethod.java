package com.wxb.beginner.hsp.chapter10.enumeration;

/**
 * @author alex
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        SeasonForEnum autumn = SeasonForEnum.AUTUMN;
        System.out.println(autumn.name());//AUTUMN

        System.out.println(autumn.ordinal());// 2

        SeasonForEnum[] values = SeasonForEnum.values();
        for (SeasonForEnum s:
             values) {
            System.out.println(s);
        }

        SeasonForEnum spring = SeasonForEnum.valueOf("SPRING");
        System.out.println(spring); // SPRING

        System.out.println(autumn.compareTo(spring));// 2

    }
}
