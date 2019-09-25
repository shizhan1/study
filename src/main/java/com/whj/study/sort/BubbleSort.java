package com.whj.study.sort;

import java.util.Arrays;

/**
 * @author whj
 * @ClassName BubbleSort.java
 * @Description 交换排序：冒泡排序（重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来）
 * 时间复杂度（平均）：O（n2)  时间复杂度（最坏）:O(n2)   时间复杂度（最好）：O(n)
 * 空间复杂度：O（1）    稳定性：稳定
 * @createTime 2019年08月29日 10:55:00
 */
public class BubbleSort {

    static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
