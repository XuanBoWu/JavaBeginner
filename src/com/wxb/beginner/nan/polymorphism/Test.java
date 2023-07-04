package com.wxb.beginner.nan.polymorphism;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.polymorphism
 * @className Test
 * @description TODO
 * @date 2023/6/27 11:08
 */

public class Test {
    public static void main(String[] args) {

        Member member1 = new OrdinaryMember();
        Member member2 = new SuperMember();
        Cashier cashier = new Cashier();

        cashier.setMember(member1);
        cashier.settlement();

        cashier.setMember(member2);
        cashier.settlement();

    }
}
