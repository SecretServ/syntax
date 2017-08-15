package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] arr = new int[15];
        int arrSize = arr.length;
        int odd = 0; //нечетные
        int even = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrSize; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0)
            {
                even += arr[i];
            }
            else
            {
                odd += arr[i];
            }
        }

        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        //напишите тут ваш код
    }
}
