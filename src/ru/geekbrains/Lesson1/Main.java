package ru.geekbrains.Lesson1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

/**
 * 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

public class Main {
    public static void main(String[] args) {
        byte b = 1;
        short s = 32;
        int i = 25365;
        long l = 73737267L;
        float f = 5.4f;
        double d = 4.596;
        char c = 5;
        boolean a = true;

        work3(1, 2, 3, 4);
        work4(3, 87);
        work5(-6);
        work6(1);
        work7("Hello,geek!");
    }

    public static void work3(float a, float b, float c, float d) {
        float e = a * (b + (c / d));
        System.out.println(e);
    }

    public static boolean work4(int a, int b) {
        int x = a + b;
        if (x >= 10 && x <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void work5(int a) {
        if (a >= 0) {
            System.out.println("положительная цифра/число");
        } else {
            System.out.println("отрицательная цифра/число");
        }
    }

    public static void work6(int i) {
        if (i < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void work7(String s) {
        System.out.println(s);

    }
}

