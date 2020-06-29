package com.whj.study.sort;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author whj
 * @ClassName MergeSort.java
 * @Description 二路归并排序 （内排序）
 *              注：多路归并排序（外排序）
 *                  1.按照内存一次性可处理的数据大小，依次从文件中读取一定数量的数据，对数据进行排序后，写到一个文件中
 *                  2.从多个有序文件中，分别读出第一个元素存入数组，判断最小的元素，将最小元素写到结果文件中
 *                      读取最小元素所在文件的下一个元素，替代最小元素，重新判断最小元素，重复此步骤
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
        // 将数组从中分为两组
        int middle = arr.size() / 2;
        // 对两组数据进行排序（最终先对两个长度为1的数组进行排序）
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
        // 比较两个有序数组中的元素
        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) <= right.get(0)) {
                result.add(left.pop());
            } else {
                result.add(right.pop());
            }
        }
        // 剩下的为较大元素，直接放在后面就可以了
        while (left.size() > 0) {
            result.add(left.pop());
        }
        while (right.size() > 0) {
            result.add(right.pop());
        }
        return result;
    }
}
