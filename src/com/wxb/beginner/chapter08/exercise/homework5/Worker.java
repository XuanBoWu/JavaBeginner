package com.wxb.beginner.chapter08.exercise.homework5;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("Worker ");
        super.printSal();
    }
}
