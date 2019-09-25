package com.whj.study.sort;

import com.whj.study.Util;

import java.util.Arrays;

/**
 * @author whj
 * @ClassName HeapSort.java
 * @Description 堆排法
 * @createTime 2019年09月03日 11:29:00
 */
public class HeapSort {

    static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {
        heapSort(arr);
        Util.printArr(arr);
        System.exit(0);
    }

    private static void heapSort(int[] arr) {

        int len = arr.length;
        buildMaxHeap(arr, len);
        for (int i = len - 1; i > 0; i--) {
            // 堆顶元素和堆尾元素互换
            swap(arr, 0, i);
            len--;
            // 重新为堆排序
            heapify(arr, 0, len);
        }
    }

    /**
     * 构建最大堆，最终arr[0]为最大值
     *
     * @param arr
     * @param len
     * @return void
     * @author whj
     * @date 2019/9/3
     */
    private static void buildMaxHeap(int[] arr, int len) {
        for (int i = len / 2; i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    /**
     * 为堆排序
     *
     * @param arr
     * @param i
     * @param len
     * @return void
     * @author whj
     * @date 2019/9/3
     */
    private static void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }

    }

    /**
     * 交换数据
     *
     * @param arr
     * @param i
     * @param j
     * @return void
     * @author whj
     * @date 2019/9/3
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
