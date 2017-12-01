package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human childOne = new Human("Katya", false, 12);
        Human childTwo = new Human("Ilya", true, 10);
        Human childThree = new Human("Maks", true, 5);
        Human mom = new Human("Sergey", false, 55,childOne,childTwo,childThree);
        Human dad = new Human("Inna", true, 55,childOne,childTwo,childThree);
        Human granddadOne = new Human("Ivan", true, 67, dad);
        Human grandmomOne = new Human("Mariya", false, 67, dad);
        Human granddadTwo = new Human("Vasya", true, 67, mom);
        Human grandmomTwo = new Human("Sasha", false, 67, mom);

        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(granddadOne);
        System.out.println(granddadTwo);
        System.out.println(grandmomOne);
        System.out.println(grandmomTwo);



    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, Human child){
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.add(child);
        }

        public Human(String name, boolean sex, int age, Human child1,Human child2,Human child3){
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.add(child1);
            children.add(child2);
            children.add(child3);
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }




        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
