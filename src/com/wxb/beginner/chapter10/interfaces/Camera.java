package com.wxb.beginner.chapter10.interfaces;

public class Camera implements UsbInterface {

    @Override
    public void start() {
        System.out.println("Camera working...");
    }

    @Override
    public void stop() {
        System.out.println("Camera stopped working...");
    }
}
