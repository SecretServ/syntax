package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result2 = new HashSet<Dog>();
        result2.add(new Dog());
        result2.add(new Dog());
        result2.add(new Dog());
        //напишите тут ваш код
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        HashSet<Object> pets = new HashSet<>();
        pets.addAll(dogs);
        pets.addAll(cats);
        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {

        for (Object value: pets)
        {
            System.out.println(value);
        }
        //напишите тут ваш код
    }

    public static class Cat
    {

    }

    public static class Dog
    {

    }//напишите тут ваш код
}
