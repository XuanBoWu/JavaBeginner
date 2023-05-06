package com.wxb.beginner.hsp.chapter08.extend_s;

public class EctendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("i7 9900", 16, 1000, "HP");
        NotePad notePad = new NotePad("M1", 8, 512, "White");

        pc.getDetails();
        notePad.getDetails();
    }
}
class Computer {
    public String cpu;
    public double ram;
    public double disk;

    public Computer() {
    }

    public Computer(String cpu, double ram, double disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    public void getDetails() {
        System.out.println("CPU:" + cpu + " RAM:" + ram + " DISK:" + disk);
    }
}

class PC extends Computer {
    public PC() {
    }

    public PC(String cpu, double ram, double disk, String brand) {
        super(cpu, ram, disk);
        this.brand = brand;
    }
    public String brand;
    public void getDetails() {
        System.out.println("CPU:" + cpu + " RAM:" + ram + " DISK:" + disk + " Brand:" + brand);
    }
}
class NotePad extends Computer {
    public NotePad(String cpu, double ram, double disk, String color) {
        super(cpu, ram, disk);
        this.color = color;
    }
    public String color;
    public void getDetails() {
        System.out.println("CPU:" + cpu + " RAM:" + ram + " DISK:" + disk + " Color:" + color);
    }
}