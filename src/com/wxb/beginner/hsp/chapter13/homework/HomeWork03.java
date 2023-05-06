package com.wxb.beginner.hsp.chapter13.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println(nameFormat("Jack Alex "));
    }

    public static String nameFormat (String str) {

        if (str == null) {
            System.out.println("String cannot be empty");
            return null;
        }

        String[] nameArray = str.split(" ");
        if (nameArray.length != 3) {
            System.out.println("Length not 3");
            return null;
        }


        String name = nameArray[2] + "," + nameArray[0] + " ." + nameArray[1].substring(0, 1).toUpperCase();

        return name;
    }
}
