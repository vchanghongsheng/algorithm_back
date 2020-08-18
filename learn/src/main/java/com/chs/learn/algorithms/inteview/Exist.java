package com.chs.learn.algorithms.inteview;

/**
 * description Exist
 *
 * @author hongs.chang
 * @since 2020-08-16 19:25
 */
public class Exist {
    public static void main(String[] args) {
        int[] a = new int[100];
        int c = 1;
        int f = 2;
        int d = 4;
        a[c] = 1;
        a[f] = 1;
        a[d] = 1;
        System.out.println(a[7]);
        System.out.println(a[2]);
    }
}
