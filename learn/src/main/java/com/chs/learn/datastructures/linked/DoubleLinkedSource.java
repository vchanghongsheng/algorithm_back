package com.chs.learn.datastructures.linked;

/**
 * description: 双向链表源码
 *
 * @author: chs
 * @since: 2020-02-14 11:01
 **/
public class DoubleLinkedSource {
    Node head;
    Node tail;
    int size;


    class Node {
        Node prev;
        Node next;
        int value;

        Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.value = data;
            this.next = next;
        }
    }

    /**
     * 往头部插
     *
     * @param data
     */
    public void headAdd(int data) {
        Node f = head;
        Node newNode = new Node(null, data, f);
        head = newNode;
        if (f == null) {
            tail = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    /**
     * 删除头数据
     */
    public void deleteHead() {
        if (head == null) {
            return;
        }
        //只有一个节点的情况,头和尾都变成空
        if (head.next == null) {
            tail = null;
            //多个节点的情况,头节点的下一节点的前指针为为空,下一节点为头节点
        } else {
            head.next.prev = null;
        }
        head = head.next;
        size--;
    }

    /**
     * 删除数据
     */
    public void delete(int data) {
        Node cur = head;
        while (cur.value != data) {
            if (cur.next == null) {
                System.out.println("找到最后没有找到节点");
                return;
            }
            cur = cur.next;
        }
        //三种情况,头部,尾部,中间
        if (cur == head) {
            deleteHead();
        } else if (cur == tail) {
            //如果是尾部,当前节点的上一个节点变成tail,取消当前节点的向上指针,向下指针本来就没有
            tail = cur.prev;
            cur.prev = null;
        } else {
            //中间的情况,当前节点的上一个节点的向下指向当前节点的下一个节点,
            //当前节点的下一个节点的向上指向当前节点的上一个节点
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }
        size--;
    }
}
