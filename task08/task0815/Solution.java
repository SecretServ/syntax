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
        map.put("Сидоров", "Пётр");
        map.put("Жуков", "Фёдор");
        map.put("Рокоссовский", "Семён");
        map.put("Конев", "Борис");
        map.put("Багратион", "Леонид");
        map.put("Гук", "Алексей");
        map.put("Медведь", "Степан");
        map.put("Петров", "Пётр");
        map.put("Подшивалов", "Сергей");

        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int countName = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if (name.equals(pair.getValue()))
            {
                countName++;
            }
        }

        return countName;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int countLastName = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if (lastName.equals(pair.getKey()))
            {
                countLastName++;
            }
        }

        return countLastName;
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        //createMap();
        //System.out.println(getCountTheSameFirstName(createMap(), "Пётр"));
        //System.out.println(getCountTheSameLastName(createMap(), "Иванов"));
    }
}
