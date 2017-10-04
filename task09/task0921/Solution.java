package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try
        {
            /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<>();*/

            //int num = Integer.parseInt(reader.readLine());

            for (int i = 0; ; i++)
            {
                list.add(i, Integer.parseInt(reader.readLine()));
            }
        }
        catch (Exception e) {
            //System.out.println(list);
            for (int value: list)
            {
                System.out.println(value);
            }
            //e.printStackTrace();
        }
        /*catch (IOException f)
        {
            System.out.println("IOException");
        }*/

        //напишите тут ваш код
    }
}
