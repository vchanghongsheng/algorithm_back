package com.chs.learn.datastructures.array;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 全国年龄分类算法
 *
 * @author changhongsheng
 * @since 2019-02-12
 */
public class AgeArithmetic {

    static final String fileName = "/Users/chs/Desktop/age.txt";

    /**
     * 生成年龄文件
     */
//    public static void main(String[] args) throws Exception {
//        Random random = new Random();
//        BufferedWriter objWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
//        for (int i = 0; i < 1400000000; i++) {
//            int age = Math.abs(random.nextInt()) % 180;
//            objWriter.write(age + "\r\n");
//        }
//        objWriter.flush();
//        objWriter.close();
//        System.out.println("写完了");
//    }

    /**
     * 统计全国每个年龄的数量
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        int[] array = new int[180];
        String str;
        int total = 0;
        BufferedReader objReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        long startTime = System.currentTimeMillis();
        while ((str = objReader.readLine()) != null) {
            int age = Integer.valueOf(str);
            array[age]++;
            total++;
        }
        System.out.println("总数据量" + total);
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":" + array[i]);
        }
        System.out.println("计算花费的时间为:" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
