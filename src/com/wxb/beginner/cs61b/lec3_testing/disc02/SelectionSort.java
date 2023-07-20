package com.wxb.beginner.cs61b.lec3_testing.disc02;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.cs61b.lec3_testing.disc02
 * @className SelectionSort
 * @description TODO
 * @date 2023/7/20 15:14
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayList = {3, 0, 1, 7, 11, 2};
        selectionSortAscending(arrayList);
        for (int i:
             arrayList) {
            System.out.print(i + " ");
        }
    }

    /**
     * 返回指定的索引后的最小值的索引
     * @param inputlist 传入的数组
     * @param k 指定的索引
     * @return 索引后的最小值的索引
     */
    public static int findAfterIndexMiniNum(int[] inputlist, int k) {
        int answer = k;
        int index = k + 1;
        int toCompare = inputlist[k];

        while (index < inputlist.length) {
            if (toCompare > inputlist[index]) {
                toCompare = inputlist[index];
                answer = index;
            }
            index++;
        }
        return answer;
    }

    /**
     * 使用选择排序算法，升序排列输入的数组
     * @param inputList 输入的数组
     */
    public static void selectionSortAscending(int[] inputList){
        int index = 0;
        while (index < inputList.length) {
            int miniNumIndex = findAfterIndexMiniNum(inputList, index);
            int tmp = inputList[index];
            inputList[index] = inputList[miniNumIndex];
            inputList[miniNumIndex] = tmp;
            index++;
        }
    }
}
