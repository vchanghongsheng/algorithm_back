package com.chs.learn.algorithms.selection;

import java.util.Arrays;

/**
 * description: 选择排序,从第一位开始往后找,直到找到最小的就交换位置
 *
 * @author: chs
 * @since: 2020-02-22 22:25
 **/
public class SelectionSort {

    /**
     * 选择排序
     *
     * @param arrays
     * @return
     */
    public static int[] selection(int[] arrays) {
//        for (int i = 0; i < arrays.length; i++) {
//            int min = i;
//            for (int j = i + 1; j < arrays.length; j++) {
//                if (arrays[j] < arrays[min]) {
//                    min = j;
//                }
//            }
//            //选择排序交换的时候不能用异或来换,因为会存在哪里比较的数(arrays[i])就是最小的,异或过后就变成0
//            //如果想用异或来换就加个判断
////            int tmp = arrays[i];
////            arrays[i] = arrays[min];
////            arrays[min] = tmp;
//            if (i != min) {
//                arrays[i] ^= arrays[min];
//                arrays[min] ^= arrays[i];
//                arrays[i] ^= arrays[min];
//            }
//        }
        for (int i = 0; i < arrays.length; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[min] > arrays[j]) {
                    min = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[min];
            arrays[min] = temp;
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] arrays = {4, 5, 6, 3, 2, 1};
//        int[] arrays1 = {4, 5, 6, 1, 2, 3};
//        int a = 0;
//        int b = 6;
//        a ^= b;
//        b ^= a;
//        a ^= b;
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(Arrays.toString(selection(arrays)));
    }


}
