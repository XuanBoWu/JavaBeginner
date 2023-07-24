package com.wxb.beginner.myproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextProcessing {
    private String filePath;
    Scanner scanner = new Scanner(System.in);



    public void menu() {

        boolean loop = true;
        int choice = -1;

        do {
            System.out.println("1 去掉中文和符号并将所有英文单词单排排布");
            System.out.println("5 退出");
            System.out.println("请选择(1~5):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 5:
                    System.out.println("退出");
                    break;
                default:
                System.out.println("退出");
                return;
            }

        } while (loop);
    }


    public void mode01() throws IOException {
        System.out.print("输入文件路径：");
        filePath = scanner.next();
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        String str;


    }
}
