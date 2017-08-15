package com.javarush.task.task05.task0520;

/* 
Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
Требования:*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = this.height = 15;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;
    }

    public Rectangle(Rectangle rect2){
        this.height = rect2.height;
        this.width = rect2.width;
        this.top = rect2.top;
        this.left = rect2.left;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
