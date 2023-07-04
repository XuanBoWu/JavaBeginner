package com.wxb.beginner.nan.javaclass;

import java.util.Objects;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.javaclass
 * @className Person
 * @description TODO
 * @date 2023/6/27 19:40
 */

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
