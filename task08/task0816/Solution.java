package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Shwarcenneger", new Date("DECEMBER 1 1980"));
        map.put("Norris", new Date("JANUARY 1 1980"));
        map.put("Statham", new Date("JUNE 1 1980"));
        map.put("Lee", new Date("JULY 1 1980"));
        map.put("Mastroyani", new Date("MAY 1 1980"));
        map.put("Willis", new Date("APRIL 1 1980"));
        map.put("Bale", new Date("SEPTEMBER 1 1980"));
        map.put("Sweppes", new Date("JUNE 1 1980"));
        map.put("Pachino", new Date("JUNE 1 1980"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            switch (pair.getValue().getMonth())
            {
                case 5: iterator.remove(); continue;
                case 6: iterator.remove(); continue;
                case 7: iterator.remove(); continue;
            }
        }
        System.out.println(map);
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        //removeAllSummerPeople(createMap());
    }
}
