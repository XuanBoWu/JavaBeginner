package com.wxb.beginner.chapter09.house_rent.service;

import com.wxb.beginner.chapter09.house_rent.domian.House;

public class HouseService {
    private House[] houses;
    private int houseNum = 1;
    private int idCounter = 1;
    public HouseService(int size) {
        houses = new House[size];

        houses[0] = new House(12, "alex", "100010", "深圳", 2000, "未出租");

    }


    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        if (houseNum >= houses.length) {
            houses = arrExtend(houses);
        }

        houses[houseNum++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] arrExtend(House[] houses) {
        House[] newHouses = new House[this.houses.length + 4];
        for (int i = 0; i < houses.length; i++) {
            newHouses[i] = houses[i];
        }
        return newHouses;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;

    }

    public House find(int findId) {
        House h = null;
        for (int i = 0; i < houseNum; i++) {
            if (findId == houses[i].getId()) {
                h = houses[i];
                break;
            }
        }
        return h;
    }
    public int find(House h) {
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (h.getId() == houses[i].getId()) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean set(House h) {
        int index = find(h);
        if (index == -1) {
            return false;
        }
        houses[find(h)] = h;
        return true;
    }
}
