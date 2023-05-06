package com.wxb.beginner.hsp.chapter08.exercise;

public class HomeWork04 {
    public static void main(String[] args) {
        Worker bob = new Worker("bob", 300, 22, 1);
        Manager alex = new Manager("alex", 500, 22, 1.2);

        bob.printSalary();
        alex.setBonus(1000);
        alex.printSalary();


    }
}
