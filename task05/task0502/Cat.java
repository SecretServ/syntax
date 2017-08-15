package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false — если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true,
то cat2.fight(cat1) = false*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {


    }

    public boolean fight(Cat anotherCat)
    {

        return (
                (this.age > anotherCat.age) &&
                        (this.weight > anotherCat.weight) &&
                        (this.strength > anotherCat.strength)
        );


    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.name = "Vaska";
        cat1.age = 8;
        cat1.weight = 8;
        cat1.strength = 8;

        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 7;
        cat2.weight = 7;
        cat2.strength = 7;

        cat1.fight(cat2);
        System.out.println(cat1.fight(cat2));

    }
}
