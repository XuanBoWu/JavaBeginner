package com.wxb.beginner.cs61b.hw0;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.hw0
 * @className DrawTriangle
 * @description TODO
 * @date 2023/7/6 23:59
 */

public class DrawTriangle {
    /*
        Drawing a Triangle
    */
    public static void main(String[] args) {
        /*
        Creative Exercise 1a: Drawing a Triangle
         */
        int num = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        DrawTriangles(10);
    }
    /*
    Creative Exercise 1b: DrawTriangle
     */
    public static void DrawTriangles(int num){

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

