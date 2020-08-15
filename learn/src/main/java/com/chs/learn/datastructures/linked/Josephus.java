package com.chs.learn.datastructures.linked;

/**
 * description:
 * 用链表实现约瑟夫算法,41个人围成一个圈,从头开始数,数到3的就自杀,最后或者的两个是16和31
 *
 * @author: chs
 * @since: 2020-02-14 19:18
 **/
public class Josephus {
    public Node head;
    public Node last;
    public int size = 0;

    /**
     * 单向循环链表
     */
    class Node {
        int value;
        Node next;

        Node(int data, Node next) {
            this.next = next;
            this.value = data;
        }
    }

    public void add(int data) {
        //创建一个新的节点
        Node newNode = new Node(data, null);
        //把这个节点放到尾节点,新建节点就是尾节点,原本的最后一个节点指向新建节点
        if (head == null) {
            head = newNode;
        }
        if (head.next == null) {
            last = newNode;
        }
        Node loc = last;
        last = newNode;
        loc.next = newNode;
        size++;
        System.out.println(size + "size");
    }

    public void delete(int data) {
        System.out.println(data + "每次删除数据");
        Node cur = head;
        Node curLast = last;
        if (cur.value == data) {
            head = cur.next;
        } else {
            for (int i = 0; i < size; i++) {
                if (curLast.value == data && cur != head) {
                    last = cur;
                }
                if (cur.next.value == data) {
                    cur.next = cur.next.next;
                }
                cur = cur.next;
            }
        }
        size--;
    }

    /**
     * @param m 每次数数的值
     */
    public void josephus(Josephus josephus, int m) {
        int a = josephus.size;
        Node cur = head;
        while (a > 1) {
            //for循环的作用就是找到要删的值
            for (int i = 0; i < m - 1; i++) {
                cur = cur.next;
            }
            delete(cur.value);
            josephus.last.next = josephus.head;
            Josephus.Node cur1 = josephus.head;
            for (int i = 0; i < josephus.size; i++) {
                System.out.print(cur1.value + ",");
                cur1 = cur1.next;
            }
            System.out.println("----------");
            cur = cur.next;
            a--;
        }
    }

}
