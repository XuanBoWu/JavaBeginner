package com.wxb.beginner.chapter17.thread;

/**
 * @author alex
 * @version 1.0
 */
public class CupNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
