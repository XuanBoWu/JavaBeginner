package com.wxb.beginner.nan.interfaces.example;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.nan.interfaces.example
 * @className Test
 * @description TODO
 * @date 2023/7/4 16:27
 */

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Equipment equipmentA = new EquipmentA();
        Equipment equipmentB = new EquipmentB();

        factory.setEquipment(equipmentA);
        factory.production();

        factory.setEquipment(equipmentB);
        factory.production();

    }
}
