package com.wxb.beginner.hsp.chapter08.objects;

public class HashCode {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();

        System.out.println(aa1.hashCode());
        System.out.println(aa2.hashCode());
        AA aa3 = aa1;
        System.out.println(aa3.hashCode());

    }
}

class AA {

}