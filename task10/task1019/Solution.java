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
            String parser = reader.readLine();
            if (!parser.isEmpty())
            {
                String name = reader.readLine();
                int id = Integer.parseInt(parser);
                map.put(name, id);
            }

           else if (parser.isEmpty())
            {
                for (Map.Entry<String, Integer> pair : map.entrySet())
                {
                    int value = pair.getValue();
                    String key = pair.getKey();
                    System.out.println(value + " " + key);
                }
                break;
            }
        }
    }
}
