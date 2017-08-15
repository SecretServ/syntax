package com.javarush.task.task07.task0707;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList();

        list.add("asdasd");
        list.add("zxczxc");
        list.add("qweqwe");
        list.add("tgbnh");
        list.add(".,mmnbn");



        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
