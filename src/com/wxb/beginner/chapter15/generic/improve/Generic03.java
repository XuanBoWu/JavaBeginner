package com.wxb.beginner.chapter15.generic.improve;

/**
 * @author alex
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        int i = 1;
        Person<Integer> person = new Person<>(i);
        person.type();
    }
}

class Person<E> {
    E s;

    public Person(E s) {
        this.s = s;
    }

    public void type() {
        System.out.println(s.getClass());
    }

    public E f() {
        return s;
    }
}
