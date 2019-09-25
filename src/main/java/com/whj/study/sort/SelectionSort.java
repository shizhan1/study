package com.whj.study.sort;

import com.whj.study.Util;

/**
 * @author whj
 * @ClassName SelectionSort.java
 * @Description 选择排序  选择最小的元素放置在最前面
 * @createTime 2019年09月02日 16:50:00
 */
public class SelectionSort {

    static Integer[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {


        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        Util.printArr(arr);

    }
}
