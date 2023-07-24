package com.wxb.beginner.hsp.chapter13.homework;

import java.util.Scanner;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        do {
//            System.out.println(scanner.next());
            switch (flag) {
                case 1:
                    System.out.print("输入姓名（2～4个字）：");
                    String name = scanner.next();
                    if (name.length() < 2 || name.length() > 4) {
                        System.out.println("姓名格式不正确！请重新输入");
                        break;
                    }
                    flag = 2;
                case 2:

                    System.out.print("Please input password(6 digits):");
                    String password = scanner.next();
                    if (password.length() != 6 || (! isDigital(password))) {
                        System.out.println("Password length is not 6 digits or Not Digital!");
                        break;
                    }

                    flag = 3;
                case 3:
                    System.out.print("Please input Email:");
                    StringBuilder email = new StringBuilder(scanner.next());
                    int i = email.indexOf("@");
                    int j = email.indexOf(".");
                    if ( ! (i > 0 && j > i)) {
                        System.out.println("Email format is incorrect!");
                        break;
                    }

                default:
                    flag = 0;
            }
        } while(flag != 0);
    }

    public static boolean isDigital(String str) {
        char[] ch = str.toCharArray();

        for (char c:
             ch) {
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }
}
