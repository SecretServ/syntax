package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] big = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < big.length; i++)
        {
            big[i] = Integer.parseInt(reader.readLine());
        }

        int[] smallOne = new int[10];
        int[] smallTwo = new int[10];
        int halfBig = big.length / 2;
        //int fullBig = big.length;

        for (int i = 0, j = halfBig; i < halfBig; i++, j++)
        {
            smallOne[i] = big[i];
            smallTwo[i] = big[j];
        }

        for (int i = 0; i < smallTwo.length; i++)
        {
            System.out.println(smallTwo[i]);
        }

        //напишите тут ваш код
    }
}
