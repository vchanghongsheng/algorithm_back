package com.chs.learn.algorithms.inteview;

/**
 * @description: 链表翻转
 * @author:andy
 * @create: 2019-02-27 14:02
 **/
public class LinkedListReversal {


    static class Node {
        int index;
        Node next;

        public Node(int index, Node next) {
            this.index = index;
            this.next = next;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "ind";
        }

    }


    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);


        System.out.println(node1.toString());
        System.out.println(reverseListNode(node1));
    }


    public static Node reverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node nodeReverse = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        System.out.println(nodeReverse);
        return nodeReverse;
    }

    public static Node reverseListNode(Node head) {
        //单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.getNext() == null) {
            return head;
        }
        //前一个节点指针
        Node preNode = null;
        //当前节点指针
        Node curNode = head;
        //下一个节点指针
        Node nextNode = null;

        while (curNode != null) {
            //nextNode 指向下一个节点
            nextNode = curNode.getNext();

            //将当前节点next域指向前一个节点
            curNode.setNext(preNode);

            //preNode 指针向后移动
            preNode = curNode;

            //curNode指针向后移动 expire
            curNode = nextNode;
        }
        return preNode;
    }

}

