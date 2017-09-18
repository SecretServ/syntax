package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.String;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

import static java.lang.Character.toUpperCase;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        int size = s.length();
        char[] chars = s.toCharArray();
        chars[0] = toUpperCase(chars[0]);

        for (int i = 0; i < size; i++)
        {
            if (chars[i] == ' ')
            {
                chars[i + 1] = toUpperCase(chars[i + 1]);
            }

        }
        //String str = chars.toString();
        //System.out.println(str);
        System.out.println(chars);

        //напишите тут ваш код
    }
}
