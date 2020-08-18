package com.chs.learn.algorithms.inteview;


/**
 * description BinarySearch
 *
 * @author hongs.chang
 * @since 2020-08-14 10:51
 */
public class BinarySearch {
    static int[] array;
    static int num;

    private static int binarySearch(int num) {
        int start = 0;
        int end = array.length - 1;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index = (start + end) / 2;
            if (i == array.length - 1) {
                System.out.println("no result");
            } else if (num > array[index]) {
                start = index;
            } else if (num < array[index]) {
                end = index;
            } else {
                System.out.println("find it");
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        array = new int[]{1, 2, 3, 4, 5, 6};
        num = 2;
        int i = binarySearch(num);
        System.out.println(array[i]);
    }
}
