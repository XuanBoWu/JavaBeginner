package com.wxb.beginner.nan.arrays.project;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author alex
 * @version 1.0
 */
public class UserManagementSystem {
    public static void main(String[] args) {
        //初始化数据
        // 用户名、年龄、状态
        String[] names = {"张三", "王武", "李四", "赵六"};
        Integer[] ages = {22, 22, 22, 22};
        String[] states = {"正常", "正常", "正常", "正常"};


        Scanner scanner = new Scanner(System.in);
        int chooseNum = 0;
        boolean isUserInput = true;
        do {
            if (isUserInput) {
                System.out.println("欢迎使用用户管理系统");
                System.out.println("1.查询用户");
                System.out.println("2.添加用户");
                System.out.println("3.删除用户");
                System.out.println("4.账号冻结");
                System.out.println("5.账号解封");
                System.out.println("6.退出系统");
                System.out.println("请选择：");

                chooseNum = scanner.nextInt();
            }
            isUserInput = true;
            String strInput = null;
            switch (chooseNum) {
                case 1:
                    System.out.println("执行查询用户操作");
                    String format = "%-10s%-10s%-10s%-10s%n";
                    System.out.format(format, "编号", "姓名", "年龄", "状态");
                    for (int i = 0; i < names.length; i++) {
                        System.out.format(format, i + 1, names[i], ages[i], states[i]);
                    }
                    end();
                    break;
                case 2:
                    System.out.println("执行添加用户操作");
                    System.out.println("请输入用户姓名");
                    String newName = scanner.next();
                    // 检验输入是否合法
                    if (!isChineseName(newName)) {
                        System.out.println("请输入合法中文名字（2-10个中文字符）");
                        end();
                        break;
                    }
                    // 检索是否已存在该用户
                    if (nameIsExist(names, newName)) {
                        System.out.println("已经存在\"" + newName + "\"，请重新输入");
//                        chooseNum = 2;
                        isUserInput = false;
                        break;
                    }

                    boolean flag = false; // 循环标志
                    int newAges = 0;
                    do { //如果用户输入的年龄有误，则要求用户再次输入
                        flag = false; // 将标志 置回false
                        System.out.println("请输入" + newName + "的年龄");
                        String strNewAges = scanner.next();

                        try {
                            newAges = Integer.parseInt(strNewAges); // 如果输入非整数，则异常处理
                        } catch (NumberFormatException e) {
                            System.out.println("请输入一个正整数!");
                            flag = true;
                            continue;
                        }

                        if (newAges <= 0) { //年龄为正整数
                            flag = true;
                            System.out.println("请输入一个正整数!");
                        }

                    } while (flag);


                    int stateNum = 0;
                    String newState = null;
                    do {
                        flag = false;
                        System.out.println("1." + State.正常 + "\n" + "2." + State.已冻结);
                        System.out.println("请输入\"" + newName + "\"的状态码");

                        try {
                            stateNum = scanner.nextInt();
                            scanner.nextLine();
                        } catch (Exception e) {
                            scanner.next(); // 用户输入无效状态码，发生异常，清除缓冲区后提醒用户重新输入
                            System.out.println("请输入有效的状态码");
                            flag = true;
                            continue;
                        }
                        switch (stateNum) {
                            case 1:
                                newState = State.正常.toString();
                                break;
                            case 2:
                                newState = State.已冻结.toString();
                                break;
                            default:
                                System.out.println("请输入有效的状态码");
                                flag = true;
                        }
                    } while (flag);

                    //数组扩容
                    names = (String[]) arrayExpansion(names);
                    ages = (Integer[]) arrayExpansion(ages);
                    states = (String[]) arrayExpansion(states);

                    names[names.length - 1] = newName;
                    ages[ages.length - 1] = newAges;
                    states[states.length - 1] = newState;

                    System.out.println("已添加新用户：" + newName);
                    end();
                    break;

                case 3:
                    System.out.println("执行删除用户操作");
                    if (names.length == 0) {
                        System.out.println("用户数组已为空！");
                        end();
                        break;
                    }
                    arrayPrint(names, ages, states);
                    System.out.println("请输入需要删除的用户编号或姓名：");
                    String strRemove= scanner.next();
                    String strName = null;
                    int indexRemove = findIndex(names, strRemove);
                    if (indexRemove != -1) {
                        strName = names[indexRemove];
                        System.out.println("将要删除\"" + strName + "\"的数据。请确认【Y/N】");
                    } else {
                        System.out.println("请请输入有效的用户名或编号");
                        break;
                    }

                    String confirm = scanner.next();
                    if ("Y".equals(confirm) || "y".equals(confirm)) {
                        names = (String[]) arrayShrink(names, indexRemove);
                        ages = (Integer[]) arrayShrink(ages, indexRemove);
                        states = (String[]) arrayShrink(states, indexRemove);
                        System.out.println("已删除\"" + strName + "\"的数据");
                    } else {
                        end();
                    }
                    break;

                case 4:
                    System.out.println("执行帐号冻结操作");
                    if (names.length == 0) {
                        System.out.println("用户数组已为空！");
                        end();
                        break;
                    }

                    arrayPrint(names, ages, states);
                    System.out.println("请输入需要冻结的用户编号或姓名：");
                    strInput= scanner.next();
                    int index4 = findIndex(names, strInput);
                    if (index4 != -1) {
                        if (states[index4] == State.正常.toString()) {
                            states[index4] = State.已冻结.toString();
                            System.out.println(names[index4] + "已冻结完成");
                        } else {
                            System.out.println(names[index4] + "已经处于冻结状态！");
                            break;
                        }
                    } else {
                        System.out.println("请请输入有效的用户名或编号");
                        break;
                    }
                    break;
                case 5:
                    System.out.println("执行账号解封操作");
                    if (names.length == 0) {
                        System.out.println("用户数组已为空！");
                        end();
                        break;
                    }

                    arrayPrint(names, ages, states);
                    System.out.println("请输入需要解封的用户编号或姓名：");
                    strInput= scanner.next();
                    int index5 = findIndex(names, strInput);
                    if (index5 != -1) {
                        if (states[index5] == State.已冻结.toString()) {
                            states[index5] = State.正常.toString();
                            System.out.println(names[index5] + "已解封");
                        } else {
                            System.out.println(names[index5] + "已经处于正常状态！");
                            break;
                        }
                    } else {
                        System.out.println("请请输入有效的用户名或编号");
                        break;
                    }

                    break;
                case 6:
                    System.out.println("退出系统");
                    System.exit(0);

                    break;
                default:
                    System.out.println("输入有误，请重新输入");

            }
        } while (true);


    }

    public static boolean isChineseName(String name) {
        if (name == null) {
            return false;
        }

        int len = name.length();
        if (len < 2 || len > 10) { // 中文名字通常在2-10个字符之间
            return false;
        }

        String regEx = "^[\u4e00-\u9fa5]{2,10}$"; // 使用Unicode编码，匹配所有的中文字符
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static int findIndex(String[] names, String str) {
        int indexRemove = -1;
        String strName = null;

        if (isChineseName(str)) {
            indexRemove = searchUsername(names, str);
            try {
                strName = names[indexRemove];
            } catch (Exception e) {
                indexRemove = -1;
            }
        } else {
            try {
                indexRemove = Integer.parseInt(str) - 1;
                strName = names[indexRemove];
            } catch (Exception e) {
                indexRemove = -1;
            }
        }
        return indexRemove;
    }


    //根据用户名返回索引
    public static int searchUsername(String[] names,String name) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                index = i;
            }
        }
        return index;
    }

    //数组遍历打印 用户列表
    public static void arrayPrint(String[] names, Integer[] ages, String[] state) {
        System.out.println("用户列表");
        String format = "%-10s%-10s%-10s%-10s%n";
        System.out.format(format, "编号", "姓名", "年龄", "状态");
        for (int i = 0; i < names.length; i++) {
            System.out.format(format, i + 1, names[i], ages[i], state[i]);
        }
    }

    //数组扩容
    public static Object arrayExpansion(Object[] array) {
        array = Arrays.copyOf(array, array.length + 1);
        return array;
    }

    //数组缩容
    public static <T>  Object arrayShrink(T[] array, int index) {
        Object[] newArray = Arrays.copyOf(array, array.length - 1);
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k++] = array[i];
        }
        return newArray;
    }

    //检索是否已存在待添加的用户姓名
    public static boolean nameIsExist(String[] array, String newName){
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (newName.equals(array[i])) {
                flag = true;
            }
        }
        return flag;
    }

    public static void end() {
        System.out.println("输入任意内容返回");
        String choose = new Scanner(System.in).nextLine();
    }

    enum State {
        正常,
        已冻结;
    }

}
