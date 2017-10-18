package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        /*for (int value : array)
        {
            System.out.println(value);
        }*/

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {

        int temp = 0;
        int size = array.length;
        int t = array.length;
        for (int index = 0; index < t; index++) {

            for (int i = 0, j = i + 1; i < size - 1; i++, j++) {
                //System.out.println("size = " + size);
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            size--;
        }


    }
}
