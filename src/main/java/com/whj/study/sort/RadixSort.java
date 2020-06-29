package com.whj.study.sort;

import com.whj.study.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author whj
 * @ClassName RadixSort.java
 * @Description 基数排序
 *          根据首先根据个位数的数值，在走访数值时将它们分配至编号0到9的桶子中，依次读取数据
 *          依次排十位，百位。。。
 * @createTime 2019年09月05日 10:42:00
 */
public class RadixSort {

    public static Integer[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {

        int max = Util.max(arr);
        //获取最大值有多少位
        int count = 1;
        int mod = 10;
        while (max >= mod) {
            mod *= 10;
            count++;
        }

        List<LinkedList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList());
        }

        List tempList = new ArrayList();
        Integer[] newArr = new Integer[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        // 从个位开始排序，每次除以10
        for (int i = 1; i <= count; i++) {
            tempList.clear();
            for (int j : newArr) {
                int temp = j;
                for (int m = 1; m < i; m++) {
                    temp /= 10;
                }
                int index = temp % 10;
                list.get(index).add(j);
            }
            for (LinkedList<Integer> singleList : list) {
                while (singleList.size() > 0) {
                    tempList.add(singleList.pop());
                }
            }
            tempList.toArray(newArr);
        }

        Util.printArr(newArr);
    }
}
