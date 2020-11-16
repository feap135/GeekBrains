package ru.geekbrains.Lesson1;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в предела
 * х от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
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
        work4(3,87);
    }

    public static void work3(float a, float b, float c, float d) {
        float e = a * (b + (c / d));
        System.out.println(e);
    }

   public static boolean work4(int a, int b){
        int x = a + b;
        if (x >= 10 && x<=20) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }
}

