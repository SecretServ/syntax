package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Vaska", new Cat("Vaska"));
        map.put("Petka", new Cat("Vaska"));
        map.put("Voffka", new Cat("Vaska"));
        map.put("Dimka", new Cat("Vaska"));
        map.put("Murka", new Cat("Vaska"));
        map.put("Lenka", new Cat("Vaska"));
        map.put("Evgeny", new Cat("Vaska"));
        map.put("Gennady", new Cat("Vaska"));
        map.put("Valera", new Cat("Vaska"));
        map.put("Igor", new Cat("Vaska"));

        //напишите тут ваш код
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        HashSet set = new HashSet();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            set.add(pair.getValue());
        }
        //напишите тут ваш код
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
