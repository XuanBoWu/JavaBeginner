package com.wxb.beginner.hsp.chapter01;

public class MazeProblem {
    public static void main(String[] args) {
        /**
         * 思路：
         * 1、先创建迷宫，用二维数组表示
         * 2、规定map数组的元素值：0 表示可以走，1表示障碍物
         */
        int[][] map = new int[8][7];
        
        //将地图的第一行和最后一行绘制为障碍物
        for (int i = 0; i < map[0].length; i++) {
            map[0][i] = 1;
            map[map.length - 1][i] = 1;
        }
        //将地图的第一列和最后一列绘制为障碍物
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][map[0].length - 1] = 1;
        }
        //设置迷宫的内部障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        //map[6][4] = 1;



        T2 t1 = new T2();
        t1.findWay(map, 1, 1);

        //输出map数组
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T2 {
    public boolean findWay(int[][] map, int i, int j) {
        /**
         * 使用递归回溯的思想解决老鼠出迷宫的问题
         *
         * 思路：
         * 1、findWay方法找出迷宫路径
         * 2、如果找到出口就输出ture，没找到就输出false
         * 3、i，j就是老鼠位置，初始化位置为(1,1)，出口位置为(6,5)
         * 4、map数组中各个值的含义：0表示可以走但没走，1表示障碍物，2表示可以走且走过了，3表示走过了但走不通
         * 5、当map[6][5] = 2时，说明已经找到出口程序结束，否则继续寻找
         * 6、老鼠的找路策略为：下-右-上-左
         */

        if (map[6][5] == 2) {//判断是否在终点
            return true;
        } else {
            //printMap(map);
            if (map[i][j] == 0) {//判断是否可以走
                map[i][j] = 2; //假设为可以走
                if (findWay(map, i + 1, j)) { //向下
                    return true;
                } else if (findWay(map, i, j + 1)) { //向右
                    return true;
                } else if (findWay(map, i - 1, j)) { //向上
                    return true;
                } else if (findWay(map, i, j - 1)) { //向左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                //printMap(map);
                return false;
            }

        }
    }
    public void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
}













