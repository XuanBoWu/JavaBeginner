package com.wxb.beginner.chapter08.exercise.homework8;

public class SavingsAccount extends BankAccount {

    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double balance, int count, double rate) {
        super(balance);
        this.count = count;
        this.rate = rate;
    }

    public void earnMonthlyInterest() {
        super.deposit(getBalance() * rate);
        count = 3;
    }


    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {

        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
