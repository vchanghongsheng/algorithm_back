package com.chs.learn.algorithms.inteview;

/**
 * description MaxProfit
 *
 * @author hongs.chang
 * @since 2020-08-14 14:27
 */
public class MaxProfit {


    static int[] price;


    /**
     * 找出最大差值，必须是右边的数-左边的数
     *
     * @param price
     * @return
     */

    public static int maxProfit(int[] price) {
        int minprice = price[0];
        int maxprofit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] < minprice) {
                minprice = price[i];
            } else if (price[i] - minprice > maxprofit) {
                maxprofit = price[i] - minprice;
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        price = new int[]{100, 11, 9, 19, 10, 111};
        int maxProfit = maxProfit(price);
        System.out.println(maxProfit);
    }
}
