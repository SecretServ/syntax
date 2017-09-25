package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Arrays.sort;
import static java.util.Collections.*;
import static javafx.scene.input.KeyCode.T;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        /*array[0] = 4;
        array[1] = 6;
        array[2] = 3;
        array[3] = 1;
        array[4] = 2;*/

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {

        int size = array.length;
        for (int i = size - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[j] < array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    /*public static void sort(int[] array) {

        int size = array.length;
        int[] copy = new int[size];

        for (int j = 0; j < size; j++)
        {
            int index = 0;
            int temp = 0;
            int max = array[0];
            for (int i = 0; i < size; i++)
            {
                if (max < array[i])
                {
                    max = array[i];
                    index = i;
                }
            }
            copy[j] = max;
            array[index] = 0;
        }

        System.arraycopy(copy, 0, array, 0, array.length);

    }*/

}
