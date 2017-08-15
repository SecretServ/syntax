package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Fiodor", 37, "Lissabon");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);//напишите тут ваш код
        Man man2 = new Man("Piotr", 33, "London");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Eleonor", 26, "Berlin");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);//напишите тут ваш код
        Woman woman2 = new Woman("Helena", 23, "Paris");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "Madrid";

        }

        public Man(String name){
            this.name = name;
            age = 22;
            address = "Amsterdam";

        }

    }



    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "Hannover";

        }

        public Woman(String name){
            this.name = name;
            age = 22;
            address = "Paris";

        }

    }



    //напишите тут ваш код
}
