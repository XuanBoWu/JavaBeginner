package com.wxb.beginner.nan.polymorphism;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.polymorphism
 * @className SuperMember
 * @description TODO
 * @date 2023/6/27 11:12
 */

//超级会员类
public class SuperMember extends Member{
    public void buyBook() {
        System.out.println("超级会员买书，打六折。");
    }
}
