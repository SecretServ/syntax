package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] ch = s.toCharArray();

        for (int i = 0; i < 40; i++)
        {
            if (ch[i] != ' ')
            {
                System.out.println(s.substring(i));
            }
            else
            {
                System.out.println(s.substring(i + 1));
            }
        }


        //напишите тут ваш код
    }

}

