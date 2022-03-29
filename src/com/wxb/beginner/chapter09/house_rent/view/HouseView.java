package com.wxb.beginner.chapter09.house_rent.view;

import com.wxb.beginner.chapter09.house_rent.domian.House;
import com.wxb.beginner.chapter09.house_rent.service.HouseService;
import com.wxb.beginner.chapter09.house_rent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    public char key = ' ';
    private HouseService houseService = new HouseService(4);


    public void mainView() {

        do {
            System.out.println("===============房屋出租系统菜单===============");
            System.out.println("\t\t\t1 新 增 房 屋");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();

            switch (key) {
                case '1':
                    System.out.println("add");
                    addHouse();
                    break;
                case '2':
                    System.out.println("find");
                    findHouse();
                    break;
                case '3':
                    System.out.println("del");
                    delHouse();
                    break;
                case '4':
                    System.out.println("revise");
                    updateHouse();
                    break;
                case '5':
                    System.out.println("list");
                    listHouse();
                    break;
                case '6':
                    // exit
                    exit();
                    break;
                default:

            }
        } while (loop);

    }

    public void listHouse() {
        System.out.println("=================房屋列表=================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=================列表结束=================");

    }

    public void addHouse() {
        System.out.println("=================添加房屋=================");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rate = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);

        House house = new House(0, name, phone, address, rate, state);
        if (houseService.add(house)) {
            System.out.println("=================房屋添加成功=================");
        } else {
            System.out.println("=================房屋添加失败=================");
        }
    }
    public void delHouse() {
        System.out.println("=================删除房屋信息=================");
        System.out.println("请输入要删除的房屋编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=================放弃删除房屋信息=================");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("=================房屋信息删除成功=================");
            } else {
                System.out.println("=================房屋信息不存在！删除失败=================");
            }

        } else {
            System.out.println("=================放弃删除房屋信息=================");
        }

    }
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
        System.out.println("退出系统");
    }

    public void findHouse() {
        System.out.println("=================房屋信息查找=================");
        System.out.println("请输入要查找的房屋编号(-1退出)：");
        int findId = Utility.readInt();
        if (findId == -1) {
            System.out.println("=================放弃查找房屋信息=================");
            return;
        }
        House h = houseService.find(findId);
        if (h == null) {
            System.out.println("=================房屋信息不存在！查找失败=================");
        } else {
            System.out.println("=================查找到的房屋信息=================");
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
            System.out.println(h);
        }
    }

    public void updateHouse() {
        System.out.println("=================房屋信息修改=================");
        System.out.println("请输入要修改的房屋编号(-1退出)：");
        int setId = Utility.readInt();
        if (setId == -1) {
            System.out.println("=================放弃修改房屋信息=================");
            return;
        }
        House h = houseService.find(setId);
        if (h == null) {
            System.out.println("=================房屋信息不存在！修改失败=================");
            return;
        }


        System.out.println("=================修改id为"+ setId + "的房屋信息=================");
        System.out.println("姓名(" + h.getName() + ")：");
        String name = Utility.readString(8, h.getName());
        System.out.println("电话(" + h.getPhone() + ")：");
        String phone = Utility.readString(12, h.getPhone());
        System.out.println("地址(" + h.getAddress() + ")：");
        String address = Utility.readString(16, h.getAddress());
        System.out.println("月租(" + h.getRent() + ")：");
        int rate = Utility.readInt(-1);
        if (rate == -1){
            rate = h.getRent();
        }

        System.out.println("状态(" + h.getState() + ")：");
        String state = Utility.readString(3, h.getState());

        System.out.println("请确认是否要修改：");
        char choice = Utility.readConfirmSelection();
        if (choice != 'Y') {
            System.out.println("=================放弃修改房屋信息=================");
            return;
        }

        House house = new House(setId, name, phone, address, rate, state);
        if (houseService.set(house)) {
            System.out.println("=================房屋修改成功=================");
        } else {
            System.out.println("=================房屋修改失败=================");
        }


    }
}
