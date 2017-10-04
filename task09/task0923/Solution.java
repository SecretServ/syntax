package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String source = input.replaceAll(" ", "");

        char[] array = source.toCharArray();
        String vowels = "";
        String cosonants = "";

        for (int i = 0; i < array.length; i++)
        {
            if (isVowel(array[i]))
            {
                vowels += String.valueOf(array[i]) + " ";
            }
            else
            {
                cosonants += String.valueOf(array[i]) + " ";
            }

        }
        System.out.println(vowels);
        System.out.println(cosonants);//напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}