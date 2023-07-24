package com.wxb.beginner.hsp.chapter08.exercise.homework5;

public class Peasant extends Employee {
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("Peasant ");
        super.printSal();
    }
}
