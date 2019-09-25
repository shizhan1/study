package com.whj.study.sort;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author whj
 * @ClassName MergeSort.java
 * @Description 归并排序
 * @createTime 2019年09月03日 10:32:00
 */
public class MergeSort {
    static LinkedList<Integer> arr = new LinkedList<>();

    static {
        arr.addAll(Arrays.asList(2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25));
    }

    public static void main(String[] args) {

        LinkedList<Integer> result = mergeSort(arr);
        System.out.println(result);

    }

    /**
     * 将数组拆分为两部分，分别排序完成后，合并两个数组，重新排序
     *
     * @param arr
     * @return java.util.LinkedList<java.lang.Integer>
     * @author whj
     * @date 2019/9/3
     */
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            return arr;
        }

        int middle = arr.size() / 2;

        return merge(mergeSort(new LinkedList<>(arr.subList(0, middle))), mergeSort(new LinkedList<>(arr.subList(middle, arr.size()))));
    }

    /**
     * 合并两个有序的数组，将两个数组重新排序
     *
     * @param left
     * @param right
     * @return java.util.LinkedList<java.lang.Integer>
     * @author whj
     * @date 2019/9/3
     */
    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();

        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) <= right.get(0)) {
                result.add(left.pop());
            } else {
                result.add(right.pop());
            }
        }
        while (left.size() > 0) {
            result.add(left.pop());
        }
        while (right.size() > 0) {
            result.add(right.pop());
        }
        return result;
    }
}
