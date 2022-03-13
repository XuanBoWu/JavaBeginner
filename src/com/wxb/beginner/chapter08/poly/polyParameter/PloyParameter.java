package com.wxb.beginner.chapter08.poly.polyParameter;

public class PloyParameter {
    public static void main(String[] args) {

        Worker bob = new Worker("Bob", 5000);
        Manager jack = new Manager("Jack", 8000, 1000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(bob);
        ployParameter.showEmpAnnual(jack);

        ployParameter.testWork(bob);
        ployParameter.testWork(jack);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof  Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("Do not handle");
        }
    }


}
