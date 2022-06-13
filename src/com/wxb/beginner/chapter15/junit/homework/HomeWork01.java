package com.wxb.beginner.chapter15.junit.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();

    }
    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1, 10, "alex"));
        dao.save("002", new User(2, 13, "bob"));
        dao.save("003", new User(3, 16, "mike"));

        System.out.println(dao.list());

        dao.delete("002");
        System.out.println(dao.list());



    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        this.map.put(id, entity);
    }

    public T get (String id) {
        return this.map.get(id);
    }

    public void update(String id, T entity) {
        this.map.put(id, entity);
    }

    public List<T> list() {
        List<T> tList = new ArrayList<>();
        for (T value : map.values()) {
            tList.add(value);
        }
        return tList;
    }

    public void delete(String id) {
        this.map.remove(id);
    }

}