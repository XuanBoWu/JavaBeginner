package com.wxb.beginner.hsp.exception.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {



        int[] nums = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
            System.out.println(cal(nums[0], nums[1]));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("参数个数错误");
        }
        catch (NumberFormatException e) {
            System.out.println("参数类型错误");
        }
        catch (ArithmeticException e) {
            System.out.println("不能除零");
        }

        System.out.println("Program end");
    }
    public static double cal(int n1, int n2) {
        double num = n1/n2;
        return num;
    }
}


