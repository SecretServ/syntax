package com.javarush.task.task05.task0510;

/* 
Создать класс Cat (кот) с пятью инициализаторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)*/
public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public void initialize(String name){
        this.name = name;
        this.weight = 15;
        this.age = 5;
        this.color = "Black";
        this.address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "White";
        this.address = null;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 15;
        this.color = "Tiger";
        this.address = null;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
        this.name = null;
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.address = null;
        this.age = 5;
        this.name = null;
    }




    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
