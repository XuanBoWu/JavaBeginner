package com.wxb.beginner.chapter02;


/**
 * 使用 Graphic 在命令行中绘制图形
 *
 * @author alex
 * @since 1.0
 */
public class Graphics {

    //传入矩形长宽绘制矩形
    public static void printRectangular(int len, int wide){
        for (int i=0 ; i < wide ; i++){
            for (int j = 0; j < len; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }



}
