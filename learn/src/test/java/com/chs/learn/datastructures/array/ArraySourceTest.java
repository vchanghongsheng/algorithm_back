package com.chs.learn.datastructures.array;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ArraySourceTest {
    @Test
    public void contextLoads() {
        ArraySource arraySource = new ArraySource();
        arraySource.add(0, 1);
        arraySource.add(1, 2);
        arraySource.remvoe(0);
    }
}