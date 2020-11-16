package ru.geekbrains.Lesson1;

/**
 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 где a, b, c, d – аргументы этого метода, имеющие тип float.
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

        work3(1,2,3,4);
    }

    public static void work3(float a, float b, float c, float d){
        float e = a * (b + (c / d));
        System.out.println(e);
    }

}

