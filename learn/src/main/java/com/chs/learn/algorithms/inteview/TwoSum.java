package com.chs.learn.algorithms.inteview;

import java.util.HashMap;
import java.util.Map;

/**
 * description TwoSum
 * 双指针场景
 * 双指针，向中间移动
 *
 * @author hongs.chang
 * @since 2020-08-14 13:45
 */
public class TwoSum {

    static int[] array;

    static int target;


//    private static Map<Integer, Integer> twoSum(int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        Map<Integer, Integer> returnMap = new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            map.put(target - array[i], i);
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (map.containsKey(i)) {
//                returnMap.put(array[i], array[map.get(i)]);
//            }
//        }
//        return returnMap;
//    }

    /**
     * 找到一个数组中两个数和为目标值
     *
     * @param target
     * @return
     */
    private static Map<Integer, Integer> twoSum(int target) {
        Map<Integer, Integer> returnMap = new HashMap<>();
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int data = array[start] + array[end];
            if (data > target) {
                end--;
            } else if (data < target) {
                start++;
            } else {
                returnMap.put(array[start], array[end]);
                end--;
                start++;
            }
        }
        return returnMap;
    }

    /**
     * 将数组中的奇数放到左边，偶数放到右边
     *
     * @return
     */
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // 当找到一个偶数时，就跳出循环。
            // (这里有个求奇偶数的小技巧，就是当一个数是奇数时，它的二进制表示的最后一位肯定是1
            while (left < right && (nums[left] & 1) == 1) {
                left++;
            }
            // 当找到一个奇数时，就跳出循环
            while (left < right && (nums[right] & 1) == 0) {
                right--;
            }
            // 如果两个指针还没有碰到一起时，说明找到了需要交换的位置
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        target = 7;
        array = new int[]{1, 2, 3, 4, 5, 6};
        Map<Integer, Integer> integerIntegerMap = twoSum(target);
        System.out.println(integerIntegerMap);
    }

}
