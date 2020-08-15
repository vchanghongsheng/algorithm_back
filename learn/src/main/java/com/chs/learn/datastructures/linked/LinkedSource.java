package com.chs.learn.datastructures.linked;

/**
 * description: linkedList源码
 *
 * @author: chs
 * @since: 2020-02-13 14:08
 **/
public class LinkedSource {
    private Node head;
    private Node last;
    private int size = 0;

    /**
     * 每个节点保存两个东西:
     * value值,next下一节点地址
     */
    class Node {
        int value;
        Node next;

        Node(int data) {
            value = data;
            next = null;
        }
    }

    /**
     * 插入到头节点
     *
     * @param data
     */
    public void headAdd(int data) {
        //创建一个新的节点
        Node newNode = new Node(data);
        //把这个节点插入到头节点,指针指向原来的头,当前节点变成头
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * 插入到尾节点
     *
     * @param data
     */
    public void lastAdd(int data) {
        //创建一个新的节点
        Node newNode = new Node(data);
        //把这个节点放到尾节点,新建节点就是尾节点,原本的最后一个节点指向新建节点
        Node loc = last;
        last = newNode;
        loc.next = newNode;
        size++;

    }

    /**
     * 插入到中间
     *
     * @param index
     * @param data
     */
    public void beforeAdd(int index, int data) {
        //创建一个新的节点
        Node newNode = new Node(data);
        //将当前节点指向下一个节点,将上一个节点指向新创建的节点
        Node cur = head;
        for (int i = 1; i < index; i++) {
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
    }

    /**
     * 查找
     *
     * @param index
     * @return
     */
    public int get(int index) {
        for (int i = 0; i < index; i++) {
            Node cur = head.next;
            return cur.value;
        }
        return 0;
    }

}
