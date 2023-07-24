package com.wxb.beginner.hsp.inheritance.equals;

/**
 * This program demonstrates the equals method | 这个程序演示了equals方法
 * @version 1.0 2022-02-27
 * @author alex
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice Adams", 7800, 2021, 4, 12);
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adams", 7800, 2021, 4, 12);
        var bob = new Employee("Bob", 5000, 2022, 1, 3);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        
        System.out.println("bob.toString(): " + bob);

        var carl = new Manager("Carl Cracker", 15000, 2011, 5, 3);
        var boss = new Manager("Carl Cracker", 15000, 2011, 5, 3);
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());

    }
}
