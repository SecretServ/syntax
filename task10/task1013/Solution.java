package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String name;
        private int age;
        private boolean sex;
        private int kids;
        private int proffesionalism;
        private Human papa;


        public Human(String name, int age, boolean sex, int kids, int proffesionalism, Human papa) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.kids = kids;
            this.proffesionalism = proffesionalism;
            this.papa = papa;
        }

        public Human(String name, int age, boolean sex, int kids) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.kids = kids;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human() {
        }

        public Human(String name, boolean sex, int kids, int proffesionalism) {
            this.name = name;
            this.sex = sex;
            this.kids = kids;
            this.proffesionalism = proffesionalism;
        }


        //8
        public Human(String name, int age, int kids, int proffesionalism) {
            this.name = name;
            this.age = age;
            this.kids = kids;
            this.proffesionalism = proffesionalism;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(boolean sex, int proffesionalism) {
            this.sex = sex;
            this.proffesionalism = proffesionalism;
        }


        // напишите тут ваши переменные и конструкторы
    }
}
