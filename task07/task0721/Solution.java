package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        int maximum;
        int minimum;

        for (int i = 0; i < 20; i++)
        {
            arr[i] = (Integer.parseInt(reader.readLine()));
        }

        minimum = arr[0];
        maximum = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (maximum < arr[i])
            {
                maximum = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (minimum > arr[i])
            {
                minimum = arr[i];
            }
        }

        //напишите тут ваш код

        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}
