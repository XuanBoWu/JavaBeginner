package com.wxb.beginner.nan.polymorphism;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.polymorphism
 * @className Cashier
 * @description TODO
 * @date 2023/6/27 11:06
 */

// 收银员类
public class Cashier {
    private Member member;


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void settlement() {
        this.member.buyBook();
    }
}
