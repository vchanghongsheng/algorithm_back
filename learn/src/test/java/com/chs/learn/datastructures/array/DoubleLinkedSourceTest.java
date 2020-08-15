package com.chs.learn.datastructures.array;

import com.chs.learn.datastructures.linked.DoubleLinkedSource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DoubleLinkedSourceTest {
    @Test
    public void headAdd(){
        DoubleLinkedSource dLinkedSource = new DoubleLinkedSource();
        dLinkedSource.headAdd(1);
        dLinkedSource.headAdd(2);
        dLinkedSource.headAdd(3);
        dLinkedSource.headAdd(4);
        dLinkedSource.deleteHead();
        dLinkedSource.delete(2);
        System.out.println(dLinkedSource);
    }

}