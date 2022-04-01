package com.wxb.beginner.chapter10;

public class StaticMethod {
    public static void main(String[] args) {
        Stu a = new Stu("A");
        Stu b = new Stu("B");
        Stu c = new Stu("C");
        a.payFee(100);
        b.payFee(100);
        c.payFee(100);

        Stu.showFee();

    }
}


class Stu{
    private String name;

    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("Student's Fee is $" + fee);
    }

}
