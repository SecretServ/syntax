package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
2.8

Пример для чисел 4 3 2 1 -1:
2.5*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        double count = 0;
        double summ = 0;
        double fin = 0;
        while(true){

            n = Integer.parseInt(reader.readLine());
            if (n == -1){
                break;
            }
            summ += n;
            count = count + 1;
        }
        fin = summ / count;
        System.out.println(fin);
        //напишите тут ваш код
    }
}

