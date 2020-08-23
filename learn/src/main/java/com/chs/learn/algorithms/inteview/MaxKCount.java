package com.chs.learn.algorithms.inteview;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * description MaxKCount
 * 最大的 k 个数
 *
 * @author hongs.chang
 * @since 2020-08-22 18:00
 */
public class MaxKCount {

    static int[] array;


    private static int[] getLeastNumber(int[] array, int k) {
        if (k == 0 || array.length == 0) {
            return new int[0];
        }
        Queue<Integer> heap = new PriorityQueue<>();

        for (int arr : array) {
            if (heap.size() < k) {
                heap.offer(arr);
            } else if (arr > heap.peek()) {
                heap.poll();
                heap.offer(arr);
            }
        }
        int[] retArray = new int[heap.size()];
        int index = 0;
        for (Integer i : heap) {
            retArray[index++] = i;
        }

        return retArray;
    }

    public static void main(String[] args) {
        array = new int[]{111, 100, 3, 4, 5, 6, 99, 77};
        int[] leastNumber = getLeastNumber(array, 7);
        System.out.println(Arrays.toString(leastNumber));

    }
}
