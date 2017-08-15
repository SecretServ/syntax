package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd(5, 1.6));
        System.out.println(convertEurToUsd(2, 1.8));
        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {

        double dollar = eur * course;
        return dollar;
        //напишите тут ваш код
    }
}
