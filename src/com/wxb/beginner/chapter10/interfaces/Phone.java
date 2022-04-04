package com.wxb.beginner.chapter10.interfaces;

public class Phone implements UsbInterface {


    @Override
    public void start() {
        System.out.println("Phone working...");
    }

    @Override
    public void stop() {
        System.out.println("Phone stopped working...");
    }
}
