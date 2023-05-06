package com.wxb.beginner.hsp.chapter01;

public class OverLoad01 {

    public static void main(String[] args) {
        VarParameter01 var = new VarParameter01();
        var.showScore("wxb", 78,72,86,90,100);
    }

}

class VarParameter01{
    public int sum(int... nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public void showScore(String str, double... scores){
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.print(str + ": " + sum);
    }
}

class MyCalculator {

    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
    public double calculate(int n1, double n2) {
        return n1 + n2;
}
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }
    public double calculate(double n1, double n2) {
        return n1 + n2;
    }
    //----------------------------------------------------
    public double m(int n1) {
        return Math.sqrt(n1);
    }
    public double m(int n1, int n2) {
        return n1 * n2;
    }
    public void m(String s1) {
        System.out.println(s1);
    }
    //----------------------------------------------------
    public int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1, double n2){
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1, double n2, double n3){
        double results;
        if (n1 > n2) {
            results = n1;
        } else if (n2 > n3) {
            results = n2;
        } else {
            results = n3;
        }
        return results;
    }

}