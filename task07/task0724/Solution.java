package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human nikolaj = new Human ("Николай", true, 69);
        Human lubov = new Human ("Любовь", false, 66);
        Human fedor = new Human ("Федор", true, 67);
        Human anastasia = new Human ("Анастасия", false, 64);

        Human svetlana = new Human ("Светлана", false, 42, nikolaj, lubov);
        Human viktor = new Human ("Виктор", true, 45, fedor, anastasia);
        Human denis = new Human ("Денис", true, 20, viktor, svetlana);
        Human olga = new Human ("Ольга", false, 25, viktor, svetlana);
        Human sergej = new Human ("Сергей", true, 21, viktor, svetlana);


        System.out.println(nikolaj.toString());
        System.out.println(lubov.toString());
        System.out.println(fedor.toString());
        System.out.println(anastasia.toString());

        System.out.println(svetlana.toString());
        System.out.println(viktor.toString());
        System.out.println(denis.toString());
        System.out.println(olga.toString());
        System.out.println(sergej.toString());


        //напишите тут ваш код
    }

    public static class Human {
        //напишите тут ваш код

        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















