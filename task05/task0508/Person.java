package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.*/

public class Person {

    private String name;
    private int age;
    private char sex;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public char getSex(){
        return sex;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
