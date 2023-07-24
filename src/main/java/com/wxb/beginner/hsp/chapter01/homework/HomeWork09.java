package com.wxb.beginner.hsp.chapter01.homework;

/**
 * Homework09
 * 9. 定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和返 回本身属性信息的功能方法getlnfo。
 */
public class HomeWork09 {
    public static void main(String[] args) {
        Music m = new Music("最长的电影", 498);
        m.play();
        m.getInfo();
    }
}
class Music {
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }
    public void play() {
        System.out.println("《" + name + "》" + "正在播放中。。。 时长为：" + times + "秒");
    }
    public void getInfo() {
        System.out.println("音乐名：" + name);
        System.out.println("音乐时长：" + times + "秒");
    }
}