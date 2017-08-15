package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = "сумма", a = null;
        int i = 0, summ = 0;

        do {
            a = reader.readLine();
            if (!(a.equals(s))){
                i = Integer.parseInt(a);
                summ += i;
            }
        }while (!(a.equals(s)));

        System.out.println(summ);

    }
}
