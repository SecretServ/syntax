package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        String str = reader.readLine();
        n = Integer.parseInt(str);

        //begin process

        int last = 0;
        int cifer = n;

        for (int i = 0; i < str.length(); i++){
            last = cifer % 10; //get last pure cifer

            if (last % 2 == 0)
            {
                even += 1;
            }
            else
            {
                odd += 1;
            }
            cifer = (cifer - last) / 10;



        }

        System.out.println("Even: " + even + " Odd: " + odd);

        //напишите тут ваш код
        //делить на 10
    }
}
