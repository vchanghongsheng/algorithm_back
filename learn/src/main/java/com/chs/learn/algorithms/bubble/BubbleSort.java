package com.chs.learn.algorithms.bubble;

import java.util.Arrays;

/**
 * description: 冒泡排序
 *
 * @author: chs
 * @since: 2020-02-23 19:13
 **/
public class BubbleSort {

    /**
     * 冒泡排序
     * 时间复杂度 O(n^2)
     * 空间复杂度 T(n)
     * 稳定
     *
     * @param arr
     * @return
     */
    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(bubble(arr)));
    }
}
