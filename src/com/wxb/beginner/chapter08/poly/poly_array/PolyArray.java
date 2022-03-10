package com.wxb.beginner.chapter08.poly.poly_array;

public class PolyArray {

    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("jack", 30);
        persons[1] = new Student("mumu", 18, 90);
        persons[2] = new Student("Alex", 20, 60);
        persons[3] = new Teacher("Bob", 40, 5000);
        persons[4] = new Teacher("Alice", 58, 10000);

        for (Person p: persons) {
            System.out.println(p.say());
            if (p instanceof Student) {
                //((Student) p).study();
                Student s = (Student) p;
                s.study();
            }
            if (p instanceof Teacher) {
                //((Teacher) p).teach();
                Teacher t = (Teacher) p;
                t.teach();
            }
        }


    }
}
