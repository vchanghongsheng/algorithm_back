package com.chs.learn.datastructures.stack;

/**
 * description:
 *
 * @author: chs
 * @since: 2020-02-15 11:45
 **/
public interface MyStack<Item> {

    /**
     * //入栈
     *
     * @param item
     * @return
     */
    MyStack<Item> push(Item item);

    /**
     * 出栈
     *
     * @return
     */
    Item pop();

    /**
     * 大小
     *
     * @return
     */
    int size();

    /**
     * 清空
     *
     * @return
     */
    boolean isEmpty();


}
