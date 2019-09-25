package com.whj.study.sort;

/**
 * @author whj
 * @ClassName InsertionSort.java
 * @Description 插入排序 默认前面已排好队
 * @createTime 2019年09月02日 17:09:00
 */
public class InsertionSort {
    static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }

        for (int i : arr) {
            System.out.printf(i + "  ");
        }
    }
}
