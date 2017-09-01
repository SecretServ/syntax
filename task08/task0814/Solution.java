package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(10);
        set.add(22);
        set.add(41);
        set.add(23);
        set.add(27);
        set.add(70);

        return set;
        //напишите тут ваш код
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        Iterator<Integer> iterator = set.iterator();
        int value = 0;

        while(iterator.hasNext())
        {
            value = iterator.next();
            if (value > 10)
            {
                iterator.remove();
            }
        }

        return set;
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {

        /*HashSet<Integer> test = createSet();
        System.out.println(test);

        HashSet<Integer> secondTest = removeAllNumbersMoreThan10(test);

        System.out.println(secondTest);*/
    }
}