package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> triplet = new ArrayList<>();
        ArrayList<Integer> duplet = new ArrayList<>();
        ArrayList<Integer> trash = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            main.add(Integer.parseInt(reader.readLine()));
        }

        //int size = main.size();

        for (int value: main)
        {
            if (value % 3 == 0)
            {
                triplet.add(value);
            }
        }

        for (int value: main)
        {
            if (value % 2 == 0)
            {
                duplet.add(value);
            }
        }

        for (int value: main)
        {
            if ((value % 3 != 0) && (value % 2 != 0))
            {
                trash.add(value);
            }
        }

        printList(triplet);
        printList(duplet);
        printList(trash);

        //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {

        for (int value: list)
        {
            System.out.println(value);
        }
        //напишите тут ваш код
    }
}
