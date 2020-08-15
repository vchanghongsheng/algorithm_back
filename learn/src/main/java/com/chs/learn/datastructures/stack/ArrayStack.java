package com.chs.learn.datastructures.stack;


/**
 * description:
 *
 * @author: chs
 * @since: 2020-02-15 14:56
 **/
public class ArrayStack<Item> implements MyStack<Item> {
    /**
     * 如果一开始为空的第一次添加容量为10
     */
    final int DEFAULT_SIZE = 10;
    /**
     * 空的数组
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    /**
     * 数组
     */
    Item[] array;
    /**
     * 当前数组大小
     */
    int size;

    /**
     * 默认为一个空的数组
     */
    public ArrayStack() {
        array = (Item[]) DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * 自定义数组大小
     *
     * @param initialCapacity
     */
    public ArrayStack(int initialCapacity) {
        array = (Item[]) new Object[initialCapacity];
    }

    /**
     * 入栈,相当于往数组最后边添加
     *
     * @param item
     * @return
     */
    @Override
    public MyStack<Item> push(Item item) {
        judgeSize();
        array[size++] = item;
        return null;
    }

    /**
     * 对size进行校验
     */
    public void judgeSize() {
        if (DEFAULTCAPACITY_EMPTY_ELEMENTDATA == array) {
            array = (Item[]) new Object[DEFAULT_SIZE];
        } else if (size + 1 > array.length) {
            resize();
        }
    }

    /**
     * 扩容
     */
    public void resize() {
        Item[] temp = (Item[]) new Object[size << 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    /**
     * 出栈
     *
     * @return
     */
    @Override
    public Item pop() {
        if (isEmpty()) {
            return null;
        }
        //--size是先做-1再执行方法
        Item item = array[--size];
        array[size] = null;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
//        int size = 0;
//        int[] a = {1, 2, 3};
//        a[size++] = 7;
//        System.out.println(Arrays.toString(a));
//        System.out.println(size);
//        int b = a[size];
//        System.out.println(b);
//        a[size] = 0;
//        System.out.println(Arrays.toString(a));
//        int a = 3;
//        System.out.println(a<<1);
//        System.out.println(a>>2);
    }
}
