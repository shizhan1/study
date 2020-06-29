package com.whj.study.sort;

import com.whj.study.Util;

import java.util.Arrays;

/**
 * @author whj
 * @ClassName HeapSort.java
 * @Description 堆排法
 *              每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆；或者每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。
 *              大顶堆：arr[i] >= arr[2i+1] && arr[i] >= arr[2i+2]
 *              小顶堆：arr[i] <= arr[2i+1] && arr[i] <= arr[2i+2]
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
     * 将数组看作一个无序的完全二叉树，a[0]为堆顶，a[1],a[2]分别为下一级节点，以此类推
     * @param arr
     * @param len
     * @return void
     * @author whj
     * @date 2019/9/3
     */
    private static void buildMaxHeap(int[] arr, int len) {
        // 从最后一个叶子节点开始调整  最后一个叶子节点：len/2-1
        // 依次检查上一个叶子节点
        for (int i = len / 2 - 1; i >= 0; i--) {
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

        // 子节点大于父节点
        if (largest != i) {
            swap(arr, i, largest);
            // 调换后，可能导致子节点的排序混乱，所以重新进行排序
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
