package com.wxb.beginner.hsp.chapter08.exercise.homework9;

public class LabeledPoint extends Point {
    private String labeled;

    public LabeledPoint(String labeled, double x, double y) {
        super(x, y);
        this.labeled = labeled;
    }
}
