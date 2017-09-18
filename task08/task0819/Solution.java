package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(new Cat());
        //напишите тут ваш код. step 3 - пункт 3
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        //напишите тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats) {

        Set<Cat> copy = new HashSet<>(cats);

        for (Cat value: copy)
        {
            System.out.println(value);
        }
        // step 4 - пункт 4
    }

    public static class Cat
    {

    }// step 1 - пункт 1
}
