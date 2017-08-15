package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10.
Результат — это 1 число.

Подсказка:
будет три миллиона с хвостиком.
*/

public class Solution {
    public static void main(String[] args) {

        int fin = 1;
        for (int i = 2; i < 11; i++){
            fin = fin * i;
        }
        System.out.println(fin);
        //напишите тут ваш код
    }
}
