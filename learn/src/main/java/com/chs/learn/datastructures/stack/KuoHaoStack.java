package com.chs.learn.datastructures.stack;

import java.util.Scanner;

/**
 * description:
 *
 * @author: chs
 * @since: 2020-02-15 14:51
 **/
public class KuoHaoStack {

    public static boolean isOk(String s) {
        //s表示的就是待匹配的括号串 [}使用字符来表示 时间复杂度 O(n)
        ArrayStack<Character> arrayStack = new ArrayStack<>();
        char[] temp = s.toCharArray();
        Character pop;
        for (char c : temp) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    arrayStack.push(c);
                    break;
                case ')':
                    pop = arrayStack.pop();
                    if (pop == null) {
                        return false;
                    }
                    if (pop == '(') {
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    pop = arrayStack.pop();
                    if (pop == null) {
                        return false;
                    }
                    if (pop == '[') {
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    pop = arrayStack.pop();
                    if (pop == null) {
                        return false;
                    }
                    if (pop == '{') {
                        break;
                    } else {
                        return false;
                    }
                default:
                    break;
            }
        }
        return arrayStack.isEmpty();
    }

    public static void main(String[] args) {
        //{{({{([{{}}])}})}}{[]}{{([])}}{{({{([{{}}])}})}}{[]}{{([])}}
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println("检查结果:" + isOk(s));
        }
    }

}
