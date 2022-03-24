package com.wxb.beginner.chapter08.exercise.homework5;

public class Waiter extends Employee {
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("Waiter ");
        super.printSal();
    }
}
