package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse minnyMouse = new Mouse("Minny", 12 , 5);
        Dog bobDog = new Dog("Bob", 15, 6);
        Dog fredDog = new Dog("Fred", 14, 6);
        Cat tomCat = new Cat("Tom", 13,5);
        Cat pussyCat = new Cat("Pussy", 12,5);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat{
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
