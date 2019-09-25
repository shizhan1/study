package com.whj.study.sort;

import com.whj.study.Util;

import java.util.Arrays;
import java.util.Random;

/**
 * @author whj
 * @ClassName CountingSort.java
 * @Description 计数排序
 * @createTime 2019年09月03日 16:36:00
 */
public class CountingSort {
    static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {

        int max = Util.max(arr);
        int min = Util.min(arr);

        int[] countArr = new int[max - min + 1];
        for (int i : arr) {
            int pointer = i - min;
            countArr[pointer] += 1;
        }
        int[] sortArr = new int[arr.length];
        int position = 0;
        for (int i = 0; i < countArr.length; i++) {
            int count = countArr[i];
            if (count > 0) {
                int value = min + i;
                Arrays.fill(sortArr, position, position + count, value);
                position += count;
            }
        }

        Util.printArr(sortArr);


    }


}
