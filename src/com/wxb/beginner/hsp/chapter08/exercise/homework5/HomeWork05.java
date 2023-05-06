package com.wxb.beginner.hsp.chapter08.exercise.homework5;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker bob = new Worker("bob", 3500);
        Peasant jack = new Peasant("jack", 3000);
        Waiter alice = new Waiter("Alice", 4000);

        Teacher lisa = new Teacher("Lisa", 4000, 200);
        lisa.setClassDay(80);

        Scientist alex = new Scientist("Alex", 8000);
        alex.setBonus(12000);


        bob.printSal();
        jack.printSal();
        alice.printSal();
        lisa.printSal();
        alex.printSal();
    }
}
