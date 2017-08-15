package com.javarush.task.task03.task0314;

/* 
Таблица умножения
Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++){
            for (int j = 1; j < 11; j++){
                System.out.print(j * i + " ");
            }
            System.out.println();
        }

        //напишите тут ваш код
    }
}
