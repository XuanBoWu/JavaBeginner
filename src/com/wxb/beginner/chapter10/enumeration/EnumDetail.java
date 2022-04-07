package com.wxb.beginner.chapter10.enumeration;

/**
 * @author alex
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSIC_MUSIC.playing();
    }
}

interface Playing {
    public void playing();
}

enum Music implements Playing {
    CLASSIC_MUSIC;

    @Override
    public void playing() {
        System.out.println("Playing Music...");
    }
}