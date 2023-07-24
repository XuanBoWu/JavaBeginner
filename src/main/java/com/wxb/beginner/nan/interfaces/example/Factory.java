package com.wxb.beginner.nan.interfaces.example;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.interfaces.example
 * @className Factory
 * @description TODO
 * @date 2023/7/4 16:25
 */

public class Factory {
    private Equipment equipment;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void production() {
        System.out.println("开始生产。。。");
        this.equipment.work();
    }

}
