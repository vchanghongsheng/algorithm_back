package com.chs.learn.datastructures.queue;

/**
 * description:
 *
 * @author: chs
 * @since: 2020-02-17 18:02
 **/
public class ArrayQueue<T> {
    /**
     * 数据
     */
    private T[] data;
    /**
     * 头
     */
    private int head;
    /**
     * 尾
     */
    private int tail;
    /**
     * 数组的大小,最大空间
     */
    private int n;
    /**
     * 当前数组大小
     */
    private int size;

    /**
     * 初始化队列容量
     *
     * @param cap
     */
    public ArrayQueue(int cap) {
        data = (T[]) new Object[cap];
        n = cap;
    }

    /**
     * 向队列尾部添加数据
     */
    public void push(T value) {
        if (tail == n) {
            return;
        }
        data[tail] = value;
        tail++;
    }

    /**
     * 从列队头拿出数据
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T m = data[head];
        head++;
        return m;
    }

    /**
     * 判空
     *
     * @return
     */
    public boolean isEmpty() {
        if (head == tail) {
            return true;
        } else {
            return false;
        }
    }


}
