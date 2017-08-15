package com.javarush.task.task05.task0528;
import java.util.*;
import java.text.SimpleDateFormat;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {

       /*GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get((Calendar.MONTH) + 1) + " " + calendar.get(Calendar.YEAR));*/

        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format1.format(d));
        //напишите тут ваш код
    }
}
