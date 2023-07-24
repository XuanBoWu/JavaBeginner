package com.wxb.beginner.nan.polymorphism;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.polymorphism
 * @className OrdinaryMember
 * @description TODO
 * @date 2023/6/27 11:05
 */

// 普通会员类
public class OrdinaryMember extends Member{
    // 实现父类的抽象方法
    public void buyBook() {
        System.out.println("普通会员买书");
    }
}
