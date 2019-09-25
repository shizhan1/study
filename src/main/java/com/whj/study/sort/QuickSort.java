package com.whj.study.sort;

/**
 * @author whj
 * @ClassName QuickSort.java
 * @Description 交换排序：快速排序（通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序）
 * 快排有两种实现，1.挖坑法 2.指针交换法
 * 时间复杂度（平均）：O（nlog2 n)  时间复杂度（最坏）:O(n2)   时间复杂度（最好）：O（nlog2 n)
 * 空间复杂度：O（nlog2 n)    稳定性：不稳定
 * @createTime 2019年08月29日 11:31:00
 */
public class QuickSort {
    static int[] arr = {2, 67, 12, 4, 23, 24, 45, 1, 6, 8, 25};


    public static void main(String[] args) {
//        digHole(arr, 0, arr.length-1);
        exchangePointer(arr, 0, arr.length - 1);
        System.out.printf("最终数据：");
        for (int i : arr) {
            System.out.printf(i + "  ");
        }
        System.exit(0);
    }


    /**
     * 指针交换法
     *
     * @param arr
     * @param start
     * @param end
     * @return void
     * @author whj
     * @date 2019/8/30
     */
    public static void exchangePointer(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;
        int pivot = arr[start];

        //从右往左查小于基数的下标
        for (; right > left; right--) {
            if (arr[right] > pivot) {
                continue;
            }
            //从左往右查大于基数的下标
            for (; left < right; left++) {
                if (arr[left] <= pivot) {
                    continue;
                }
                // 交换数据
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                break;
            }
            if (right <= left) {
                break;
            }
        }
        //交换基数和汇合位置的数
        arr[start] = arr[right];
        arr[left] = pivot;
        print(arr, left, right);
        exchangePointer(arr, start, right - 1);
        exchangePointer(arr, right + 1, end);

    }

    private static void print(int[] arr, int left, int right) {
        for (int i : arr) {
            System.out.printf(i + "  ");
        }
        System.out.println();
        System.out.println("left:" + arr[left] + ",left:" + left + ",right:" + right);
    }


    /**
     * 挖坑法
     *
     * @param arr
     * @param start
     * @param end
     * @return void
     * @author whj
     * @date 2019/8/29
     */

    public static void digHole(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // 指定基准
        int hole = arr[start];
        int right = end;
        int left = start;
        // 右指针移动，将小于基准的值赋值给左指针
        for (; right > left; right--) {
            if (arr[right] >= hole) {
                continue;
            }
            arr[left] = arr[right];
            // 左指针移动，将大于基准的值赋给右指针
            for (; left < right; left++) {
                if (arr[left] <= hole) {
                    continue;
                }
                arr[right] = arr[left];
                break;
            }
            if (right <= left) {
                break;
            }
        }
        //将基准赋值给相遇时指针（左右指针相遇）
        arr[right] = hole;
        print(arr, left, right);
        if (left - start > 1) {
            digHole(arr, start, left - 1);
        }
        if (end - left > 1) {
            digHole(arr, left + 1, end);
        }

    }
}
