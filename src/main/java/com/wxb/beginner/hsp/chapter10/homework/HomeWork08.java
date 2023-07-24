package com.wxb.beginner.hsp.chapter10.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
    }
}
interface A9 {
    public void show();
}
enum Color implements A9 {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    int redValue;
    int greenValue;
    int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("R:" + redValue + " G:" + greenValue + " B:" + blueValue);
    }
}