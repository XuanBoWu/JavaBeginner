package com.wxb.beginner.chapter08.exercise.homework10;

import java.util.Objects;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return this.name.equals(doctor.getName())
                && this.age == (doctor.getAge())
                && this.job.equals(doctor.getJob())
                && this.gender.equals(doctor.getGender())
                && this.salary == (doctor.getSalary());

    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Doctor doctor = (Doctor) o;
//        return age == doctor.age && Double.compare(doctor.salary, salary) == 0 && name.equals(doctor.name) && job.equals(doctor.job) && gender.equals(doctor.gender);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getJob(), getGender(), getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
