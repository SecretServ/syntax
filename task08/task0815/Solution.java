package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Иванов", "Иван");
        map.put("Иванов", "Пётр");
        map.put("Иванов", "Фёдор");
        map.put("Иванов", "Семён");
        map.put("Иванов", "Борис");
        map.put("Иванов", "Леонид");
        map.put("Гук", "Алексей");
        map.put("Медведь", "Степан");
        map.put("Петров", "Пётр");
        map.put("Подшивалов", "Сергей");

        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {


        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
        }

        return 5;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
