package com.javarush.task.task10.task1005;

/* 
Задача №5 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short)300;
        short c = (short)(b - a);
        System.out.println(c);

        /*System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);*/
    }
}