package com.wxb.beginner.nan.interfaces.example;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.interfaces.example
 * @className EquipmentB
 * @description TODO
 * @date 2023/7/4 16:33
 */

public class EquipmentB implements Equipment{
    @Override
    public void work() {
        System.out.println("使用设备B，生产产品B");
    }
}
