package com.chs.learn.algorithms.recursion;

/**
 * description: 斐波那契数列 1 1 2 3 5 8 13 21 34 55
 * @see com.chs.learn.algorithms.merge.MergeSort
 *
 * @author: chs
 * @since: 2020-02-19 10:26
 **/
public class Fibonacci{
    /**
     * 利用递归实现斐波那契数列
     * f(n)=f(n-1)+f(n-2)
     */
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * 第一种优化斐波那契方式:不用递归,转化成普通方式
     */
    public static int noFab(int n) { // 不用递归 O(n)
        // 循环
        if (n <= 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    /**
     * 用数组来做缓存 将为了O(n)，空间也降至为O(n)
     *
     * @param n
     * @return
     */
    static int[] data;

    public static int fab2(int n) {
        // 递归的终止条件
        if (n <= 2) {
            return 1;
        }
        if (data[n] > 0) {
            return data[n];
        }
        // 继续递归的过程
        int res = fab2(n - 1) + fab2(n - 2);
        data[n] = res;
        return res;
    }

    /**
     * 分析一段代码好坏，有两个指标，时间复杂度和空间复杂度 都是： O(n)
     *
     * @param pre
     * @param res
     * @param n
     * @return
     */
    public static int tailfab(int pre, int res, int n) {
        // 递归的终止条件
        if (n <= 2) {
            return res;
        }
        //JDK源码
        return tailfab(res, pre + res, n - 1);
        //参数：
        /**
         * n 是肯定有的
         * res 上一次运算出来结果
         * pre 上上一次运算出来的结果
         */
    }


    /**
     * 利用递归实现 排队问题:当前位置的人想知道他在队伍的第几个
     * f(n)=f(n-1)+1
     */
    static int a = 0;

    public static int queueUp(int n) {
        if (n == 1) {
            return 1;
        }
        a++;
        System.out.println(a + "------" + n);
        return queueUp(n - 1) + 1;

    }

    public static void main(String[] args) {
        int b = 46;
        //未经过优化的递归(斐波那契数列)
        for (int i = 1; i < b; i++) {
            long start = System.currentTimeMillis();
            System.out.println(System.currentTimeMillis() - start + "-2^" + i + "执行消耗时间" + fib(i));
        }
        //利用递归实现 排队问题:当前位置的人想知道他在队伍的第几个
        System.out.println(queueUp(100));
    }
}
