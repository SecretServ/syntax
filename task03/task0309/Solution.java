package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
…

Пример вывода:
1
3
6
10
...
*/

public class Solution {
    public static void main(String[] args) {

        int j = 0;
        for (int i = 1; i < 11; i++){
            j = j + i;
           System.out.println(j);
        }
        //напишите тут ваш код
    }
}