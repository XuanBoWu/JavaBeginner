package com.wxb.beginner.hsp.chapter10.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Car car = new Car(12);
        Car car2 = new Car(-1);
        Car car3 = new Car(45);
        Car car4 = new Car(30);
        car.air.flow();
        car2.air.flow();
        car3.air.flow();
        car4.air.flow();
    }
}

class Car {
    private double temperature;
    public Air air;
    public Car(double temperature) {
        this.temperature = temperature;
        air = new Air();
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("冷风");
            } else if (temperature < 0) {
                System.out.println("暖风");
            } else {
                System.out.println("关闭");
            }
        }
    }
}