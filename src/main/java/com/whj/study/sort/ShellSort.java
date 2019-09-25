package com.whj.study.sort;

import com.whj.study.Util;

/**
 * @author whj
 * @ClassName ShellSort.java
 * @Description 希尔排序
 * 简单插入排序的改进版。它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序
 * @createTime 2019年09月03日 09:26:00
 */
public class ShellSort {

    public static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int index = gap; index < arr.length; index++) {
                int temp = arr[index];
                int position = index;
                for (int i = index - gap; i >= 0 && arr[i] > temp; i -= gap) {
                    arr[i + gap] = arr[i];
                    position = i;
                }
                arr[position] = temp;
            }
        }

        Util.printArr(arr);
        System.exit(0);

    }

}
