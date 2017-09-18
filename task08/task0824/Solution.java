package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> empty = new ArrayList<>();

        //third generation Objects and List
        Human firstChild = new Human("First", true, 9, empty);
        Human secondChild = new Human ("Second", true, 12, empty);
        Human thirdChild = new Human ("Third", false, 14, empty);

        ArrayList<Human> thirdGen = new ArrayList<>();
        thirdGen.add(firstChild);
        thirdGen.add(secondChild);
        thirdGen.add(thirdChild);


        //second generation Objects and Lists
        Human georgy = new Human ("Georgy", true, 42, thirdGen);
        Human svetlana = new Human ("Svetlana", false, 42, thirdGen);

        ArrayList<Human> secondGenBorsuk = new ArrayList<>();
        secondGenBorsuk.add(georgy);

        ArrayList<Human> secondGenKlimovitch = new ArrayList<>();
        secondGenKlimovitch.add(svetlana);

        //first generation Objects and List
        Human vladimir = new Human ("Vladimir", true, 66, secondGenBorsuk);
        Human maria = new Human ("Maria", false, 64, secondGenBorsuk);

        Human ivan = new Human ("Ivan", true, 72, secondGenKlimovitch);
        Human zina = new Human ("Zinaida", false, 73, secondGenKlimovitch);

        //methods callin
        System.out.println(zina.toString());
        System.out.println(ivan.toString());
        System.out.println(maria.toString());
        System.out.println(vladimir.toString());
        System.out.println(svetlana.toString());
        System.out.println(georgy.toString());
        System.out.println(thirdChild.toString());
        System.out.println(secondChild.toString());
        System.out.println(firstChild.toString());

        //напишите тут ваш код
    }

    public static class Human {

        String name = null;
        boolean sex = false;
        int age = 0;
        ArrayList<Human> children = null;

        public  Human (String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
