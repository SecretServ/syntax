package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());
        }

        int size = list.size();
        int min = list.get(0).length();
        int max = list.get(0).length();
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < size; i++)
        {
            if (min > list.get(i).length())
            {
                min = list.get(i).length();
            }
        }

        //System.out.println("min: " + min);

        for (int i = 0; i < size; i++)
        {
            if (max < list.get(i).length())
            {
                max = list.get(i).length();
            }
        }
        //System.out.println("max: " + max);


        //found min index of min string

        for (int i = 0; i < size; i++)
        {
            if (min == list.get(i).length())
            {
                indexMin = i;
                break;
            }
        }

        //System.out.println("indexMin: " + indexMin);

        //found maximal index of maximal string

        for (int i = 0; i < size; i++)
        {
            if (max == list.get(i).length())
            {
                indexMax = i;
                break;
            }
        }
        //System.out.println("indexMax: " + indexMax);


        if (indexMax < indexMin)
        {
            System.out.println(list.get(indexMax));
        }
        else
        {
            System.out.println(list.get(indexMin));
        }



        //напишите тут ваш код
    }
}
