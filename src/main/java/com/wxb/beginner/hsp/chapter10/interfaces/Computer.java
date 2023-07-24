package com.wxb.beginner.hsp.chapter10.interfaces;

public class Computer {



    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
