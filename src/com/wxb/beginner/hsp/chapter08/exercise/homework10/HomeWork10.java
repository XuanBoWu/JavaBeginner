package com.wxb.beginner.hsp.chapter08.exercise.homework10;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor bob = new Doctor("bob", 34, "Doctor", "M", 8000);
        Doctor alex = new Doctor("alex", 25, "Doctor", "M", 5000);
        Doctor bob1 = new Doctor("bob", 34, "Doctor", "M", 8000);

        System.out.println(bob.equals(alex));
        System.out.println(bob.equals(bob1));
    }
}
