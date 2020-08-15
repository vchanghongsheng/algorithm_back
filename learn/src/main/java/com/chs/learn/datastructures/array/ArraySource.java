package com.chs.learn.datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * description: arrayList源码
 *
 * @author : chs
 * @since: 2020-02-12 11:49
 **/
public class ArraySource {
    int[] data;
    int index;
    int size;
    int defaultCapacity = 10;

    public ArraySource() {
        data = new int[defaultCapacity];
        index = 0;
        size = 10;
    }

    public ArraySource(int capacity) {
        data = new int[capacity];
        index = 0;
        size = capacity;
    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list1 = new LinkedList<>();
//        list.add(0, "1");
//        list.add(1, "2");
//        list.add(2, "3");
//        list.add(1, "5");
//    }

    /**
     * 新增
     * 从当前插入位置开始每一位向后挪,把值赋到当前位置
     */
    public void add(int loc, int value) {
        for (int i = size - 1; i > loc; i--) {
            data[i] = data[i - 1];
        }
        data[loc] = value;
        index++;
        System.out.println(Arrays.toString(data));
    }

    /**
     * @param loc 删除指定位置,从当前位置,后面的每一位向前挪,如果是最后一位就变成0
     */
    public void remvoe(int loc) {
        if (loc < size) {
            for (int i = loc; i < size; i++) {
                if (i != size - 1) {
                    data[i] = data[i + 1];
                } else {
                    data[i] = 0;
                }

            }
            index--;
        }
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        System.out.println(ArraySource.class.getClassLoader().getClass().getName());
    }
}
