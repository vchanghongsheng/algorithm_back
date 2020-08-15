package com.chs.learn.juc;

import lombok.SneakyThrows;

/**
 * description:
 *
 * @author: chs
 * @since: 2020-03-01 17:44
 **/
public class JMM {
    static int x;
    static int y;
    static int a;
    static int b;

//    public static void main(String[] args) throws InterruptedException {
//        int i = 0;
//        for (; ; ) {
//            i++;
//            x = 0;
//            y = 0;
//            a = 0;
//            b = 0;
//            Thread thread1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    shortWait(100000);
//                    a = 1;
//                    x = b;
//                }
//            });
//            Thread thread2 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    b = 1;
//                    y = a;
//                }
//            });
//            thread1.start();
//            thread2.start();
//            thread1.join();
//            thread2.join();
//
//            String result = "第" + i + "次(" + x + "," + y + ")";
//            if (x == 0 && y == 0) {
//                System.err.println(result);
//                break;
//            } else {
//                System.out.println(result);
//            }
//        }
//    }

    public static void shortWait(long interval) {
        long start = System.nanoTime();
        long end;
        do {
            end = System.nanoTime();
        } while (start + interval >= end);

    }

    public static void main(String[] args) {
        shortWait(1000);
    }
}
