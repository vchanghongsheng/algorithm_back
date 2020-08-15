package com.chs.learn;

public class Array {
    public static void main(String[] args) {
//        String str1 = "abc";
//        str1 = "bcd";
//        String str3 = str1;
//        System.out.println(str3); //bcd
//        String str4 = "bcd";
//        System.out.println(str1 == str4);	//true

//        String str1 = "abc";
//        String str2 = "abc";
//        System.out.println(str1==str2); 	//false  new在堆内存中新开了一个对象

//        String s1 = "ja";
//        String s2 = "va";
//        String s3 = "java";
//        //java 注意这个+号，java里面重载了+，其实调用了stringBuild，会new对象。
//        String s4 = s1 + s2;
//        //false
//        System.out.println(s3 == s4);
//        //true 只是比较值
//        System.out.println(s3.equals(s4));

//        String a = "ja";
//        String b = "java";
//        StringBuffer sf = new StringBuffer(a);
//        sf.append("va");
//        System.out.println(System.identityHashCode(sf));
//        sf.append("111");
//        System.out.println(System.identityHashCode(sf));
//        String c = sf.toString();
//        System.out.println(System.identityHashCode(c));
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(String.valueOf(sf)==b);


//        String a = "abc";
//        String b = "abc";
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(a==b);
        int[] a = {1, 2, 3};
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(a[0]));
        System.out.println(System.identityHashCode(a[1]));
        System.out.println(System.identityHashCode(a[2]));
    }
}
