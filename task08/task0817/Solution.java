package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Сидоров", "Пётр");
        map.put("Жуков", "Иван");
        map.put("Рокоссовский", "Семён");
        map.put("Конев", "Иван");
        map.put("Багратион", "Леонид");
        map.put("Гук", "Алексей");
        map.put("Медведь", "Степан");
        map.put("Петров", "Пётр");
        map.put("Подшивалов", "Сергей");

        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //HashMap<String, String> copy = new HashMap<>(map);
        HashMap<String, String> copyNew = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copyNew.entrySet()) {
            String valueFirst = pair.getValue();
            int count = 0;
            for (Map.Entry<String, String> pairSecond : copyNew.entrySet())
            {
                if (valueFirst.equals(pairSecond.getValue()))
                {
                    count++;
                    if (count > 1)
                    {
                        removeItemFromMapByValue(map, valueFirst);
                    }
                }

            }
        }
        System.out.println(map);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }

    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
