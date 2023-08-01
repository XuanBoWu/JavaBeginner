package com.wxb.beginner.review.io.task7_2;

import com.wxb.beginner.review.io.StringStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io.task7_2
 * @className Mian
 * @description TODO
 * @date 2023/8/1 14:47
 */

public class Mian {
    private static String filePath;
    private static String message;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--1：新建文件 2：打开文件 3：修改文件 4:保存 5:退出--");
        while (true) {
            System.out.print("请输入操作指令：");
            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    createFile();
                    break;
                case 2:
                    openFile();
                    break;
                case 3:
                    break;
                case 4:
                    saveFile();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("输入的操作指令有误！");
            }
        }
    }
    public static void createFile() {
        message = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容，停止编写请输入\"stop\"：");
        StringBuffer stb = new StringBuffer();
        String inputString = "";
        while (!inputString.equals("stop")) {
            if (stb.length() > 0) {
                stb.append("/r");
            }
            stb.append(inputString);
            inputString = sc.nextLine();
        }
        message = stb.toString();
    }

    private static void openFile() throws IOException {
        if (!isSave()) {
            System.out.println("文件未保存，请保存或舍弃后再打开文件");
            return;
        }
        message = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要打开文件的路径：");
        filePath = sc.nextLine();

        if (filePath != null && !filePath.endsWith(".txt")) {
            System.out.println("请选择txt文件！");
            return;
        }
        FileReader in = new FileReader(filePath);
        BufferedReader br = new BufferedReader(in);
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        message = sb.toString();
        System.out.println("打开的文件内容：\n" + message);
        in.close();

    }

    private static void saveFile() {
    }

    private static boolean isSave() {
        if (message != null && message.length() > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("还有未保存的文件，请问是否保存？(Y/N)");
            String s = sc.nextLine();
            if ("Y".equals(s) || "y".equals(s)) {
                saveFile();
                return true;
            } else if ("N".equals(s) || "n".equals(s)){
                return true;
            } else {
                System.out.println("输入错误");
                return false;
            }
        } else {
            return true;
        }
    }
}
