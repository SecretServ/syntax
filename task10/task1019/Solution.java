package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();




        while (true)
        {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            if (name.isEmpty())
            {
                for (Map.Entry<String, Integer> pair : map.entrySet())
                {
                    id = pair.getValue();
                    name = pair.getKey();
                    System.out.println("Id=" + id + " Name=" + name);
                }
            }
            else
            {
                map.put(name, id);
            }
        }

        /*for ( ; ; )
            {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                map.put(name, id);
                *//*if (name.isEmpty())
                {
                    for (Map.Entry<String, Integer> pair : map.entrySet()) {
                        id = pair.getValue();
                        name = pair.getKey();
                        System.out.println("Id=" + id + " Name=" + name);
                    }
                }*/





        //System.out.println("Id=" + id + " Name=" + name);
    }
}
