



//LAST FUCKIN LESSON BEFORE START PAYIN'



package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 8345);
        map.put("Сидоров", 124);
        map.put("Жуков", 200);
        map.put("Рокоссовский", 65345);
        map.put("Конев", 499);
        map.put("Багратион", 950);
        map.put("Гук", 240);
        map.put("Медведь", 450);
        map.put("Петров", 150);
        map.put("Бидюкин", 2400);

        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair: copy.entrySet())
        {
            if (pair.getValue() < 500)
            {
                map.remove(pair.getKey());
            }
        }
        //System.out.println(map);
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        //removeItemFromMap(createMap());
    }
}