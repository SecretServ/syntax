package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {

        double temp = (double)(i * 10) / 100;
        double fin = temp + i;
        return fin;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

        System.out.println(addTenPercent(9));
    }
}
