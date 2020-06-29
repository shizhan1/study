package com.whj.study.sort;

import com.whj.study.Util;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whj
 * @ClassName BucketSort.java
 * @Description 桶排法（计数法+快排）
 * @createTime 2019年09月03日 17:28:00
 */
public class BucketSort {

    static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};

    public static void main(String[] args) {
        // 最大 和 最小
        int max = Util.max(arr);
        int min = Util.min(arr);

        //一个桶里放置数据的大小查
        int size = 10;
        //需要几个桶
        int count = (max - min) / size + 1;
        //将数据分散到不同的桶内
        List<List> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            list.add(new ArrayList());
        }
        // 根据数据大小先进行依次划分排序
        for (int i : arr) {
            int index = (i - min) / size;
            List bucket = list.get(index);
            bucket.add(i);
        }

        //用快排为分别对桶内数据排序，并将排序后的数据赋值给目标数组
        int[] resultArr = new int[arr.length];
        int position = 0;
        for (List bucket : list) {
            Integer[] temp = new Integer[bucket.size()];
            bucket.toArray(temp);
            int[] primitiveArr = ArrayUtils.toPrimitive(temp);
            QuickSort.digHole(primitiveArr, 0, primitiveArr.length - 1);
            System.arraycopy(primitiveArr, 0, resultArr, position, primitiveArr.length);
            position += primitiveArr.length;
        }

        System.out.println("最终排序：");
        Util.printArr(resultArr);

    }


}
