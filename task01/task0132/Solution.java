package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
Реализуй метод sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int hundreds = number / 100;
        int hundredsMinus = hundreds * 100;

        int tens = (number - hundredsMinus) / 10;
        int tensMinus = tens * 10;

        int ones = (number - hundredsMinus - tensMinus);

        int fin = hundreds + tens + ones;

        return fin;
        //напишите тут ваш код
   }
}