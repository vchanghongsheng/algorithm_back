package com.chs.learn.algorithms.inteview;

/**
 * description NotRepeating
 *
 * @author hongs.chang
 * @since 2020-08-15 14:47
 */
public class NotRepeating {
    static int[] array;


    private static int notRepeat(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        array = new int[]{1, 2, 6, 7, 7, 8, 8, 6, 1, 3, 2};
        int i = notRepeat(array);
        System.out.println(i);


        int A = 2;
        int B = 2;
        int c = A ^ B ^ B;
        System.out.println(c);
        System.out.println(2 ^ 2 ^ 7 ^ 6 ^ 11 ^ 77);
        System.out.println(2 ^ 2 ^ 6 ^ 7 ^ 77 ^ 11);

        System.out.println(1^2^3^4^4);
    }
}
