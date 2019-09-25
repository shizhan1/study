package com.whj.study;

/**
 * @author whj
 * @ClassName Util.java
 * @Description TODO
 * @createTime 2019年09月03日 09:45:00
 */
public class Util {


    public static void printArr(Object[] arr) {
        for (Object i : arr) {
            System.out.printf(i + "  ");
        }
    }

    public static void printArr(int[] arr) {
        for (Object i : arr) {
            System.out.printf(i + "  ");
        }

    }

    public static int max(Integer[] arr) {
        int max = arr[0];
        for (int i : arr) {
            max = i > max ? i : max;
        }
        return max;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            max = i > max ? i : max;
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            min = i < min ? i : min;
        }
        return min;
    }
}
