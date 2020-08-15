package com.chs.learn.datastructures.stack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArrayStackTest {

    @Test
    public void arrayStack() {
        ArrayStack<Character> arrayStack = new ArrayStack(2);
        arrayStack.push('1');
        arrayStack.push('2');
        arrayStack.push('3');
        Character item = arrayStack.pop();
        System.out.println(item);
        System.out.print(arrayStack.size());
    }

}