package com.wxb.beginner.chapter10.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person alex = new Person("alex", new Horse());
        alex.way();
        alex.passRiver();
        alex.way();
        alex.passRiver();
        alex.passMountain();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passMountain() {
        this.vehicles = Factory.getPlane();
        vehicles.work();
    }

    public void passRiver() {
        this.vehicles = Factory.getBoat();
        vehicles.work();
    }

    public void way() {
        if (!(this.vehicles instanceof Horse)) {
            this.vehicles = Factory.getHorse();
        }
        vehicles.work();
    }

    public String getName() {
        return name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }
}
interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("陆地骑马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河乘船");

    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("过山乘飞机");
    }
}

class Factory {
    private static Horse horse = new Horse();

    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }
}