package com.javarush.task.task09.task0926;

//import java.lang.reflect.Array;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;


/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();

        list.add(0, new int[] {5, 4, 3, 2, 1});
        list.add(1, new int[] {22, 23});
        list.add(2, new int[] {45, 44, 43, 42});
        list.add(3, new int[] {75, 74, 73, 72, 71, 70, 76});
        list.add(4, new int[0]);
        return list;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
