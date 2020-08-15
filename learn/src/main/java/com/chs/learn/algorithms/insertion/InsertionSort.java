package com.chs.learn.algorithms.insertion;

import java.util.Arrays;

/**
 * description: 插入排序
 *
 * @author: chs
 * @since: 2020-02-21 21:47
 **/
public class InsertionSort {
    /**
     * 插入排序算法 时间复杂度O(n^2)
     */
    public static void insertion(int[] arrays) {
        //将数组分为两部分,第一部分进行排序,从第二部分往第一部分拿数据,从右往左拿
        for (int i = 1; i < arrays.length; i++) {
            //从第一部分的后面往前面比较,遇到比自己小的就结束
            for (int j = i; j > 0; j--) {
                if (arrays[j - 1] > arrays[j]) {
                    //遇到比自己大的就和它换位置
                    int tmp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }

    public static void main(String[] args) {
        int[] arrays = {1, 2, 5, 3, 10, 99, 55,9,10};
        insertion(arrays);
    }
}
