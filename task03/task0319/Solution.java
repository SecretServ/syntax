package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
«Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();

        int salary = Integer.parseInt(num1);
        int years = Integer.parseInt(num2);

        System.out.println(name + " получает " + salary + " через " + years + " лет.");


        //напишите тут ваш код
    }
}
