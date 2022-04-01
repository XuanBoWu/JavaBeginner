package com.wxb.beginner.chapter10;

public class ChildGame {
    public static void main(String[] args) {
        Child alex = new Child("Alex");
        Child bob = new Child("Bob");
        Child alice = new Child("Alice");
        Child jack = new Child("Jack");

        alex.join();
        bob.join();
        alice.join();
        jack.join();


    }

}


class Child {
    public static int count = 0;

    public String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        count++;
        System.out.println("No." + count + " 2" + name + " join the game");
    }
}