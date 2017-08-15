package com.javarush.task.task03.task0318;

/* 
План по захвату мира
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String period = reader.readLine();
        String name = reader.readLine();

        int years = Integer.parseInt(period);

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
        //напишите тут ваш код
    }
}
