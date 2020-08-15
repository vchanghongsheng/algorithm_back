package com.chs.learn.datastructures.linked;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class JosephusTest {
    @Test
    public void get() {
        Josephus josephus = new Josephus();
        for (int i = 1; i <= 6; i++) {
            josephus.add(i);
        }
        Josephus.Node cur = josephus.head;
        for (int i = 0; i < josephus.size; i++) {
            System.out.println(cur.value);
            cur = cur.next;
        }
        josephus.last.next = josephus.head;
        System.out.println(josephus.last.next.value);

        System.out.println(josephus);
        System.out.println(josephus.last.next.next.value);
    }

    @Test
    public void delete() {
        Josephus josephus = new Josephus();
        for (int i = 1; i <= 6; i++) {
            josephus.add(i);
        }
        Josephus.Node cur = josephus.head;
        for (int i = 0; i < josephus.size; i++) {
            System.out.println(cur.value);
            cur = cur.next;
        }
        josephus.last.next = josephus.head;
        josephus.delete(3);
        System.out.println(josephus);
    }

    @Test
    public void josephus() {
        Josephus josephus = new Josephus();
        for (int i = 1; i <= 41; i++) {
            josephus.add(i);
        }
        Josephus.Node cur = josephus.head;
        for (int i = 0; i < josephus.size; i++) {
            System.out.print(cur.value+",");
            cur = cur.next;
        }
        System.out.println("----------");
        josephus.last.next = josephus.head;
        josephus.josephus(josephus, 3);
        Josephus.Node cur1 = josephus.head;
        for (int i = 0; i < josephus.size; i++) {
            System.out.println("==========");
            System.out.println(cur1.value);
        }
    }

}