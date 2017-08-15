package com.javarush.task.task04.task0442;


/* 
Суммирование
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.*/

import java.io.*;

public class Solution {

    //public static int summ = 0;
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        int n = 0;

        while(n != -1){

            //str = reader.readLine();
            n = Integer.parseInt(reader.readLine());
            summ +=n;
        }
        //summ += n;
        System.out.println(summ);        //напишите тут ваш код
    }
}
