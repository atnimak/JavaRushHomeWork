package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandadOne = new Human("Bendgamin",true,85);
        Human grandadTwo = new Human("Ross",true,84);
        Human granmaOne = new Human("Nana",false,75);
        Human granmaTwo = new Human("Ruth",false,76);
        Human father = new Human("Chandler",true,40,granmaOne,grandadOne);
        Human mom = new Human("Monika",false,36,granmaTwo,grandadTwo);
        Human sonOne = new Human("Bob",true,16,mom,father);
        Human sonTwo = new Human("Joe",true,13,mom,father);
        Human daughter = new Human("Rachel",false,6,mom,father);
        System.out.println(daughter);
        System.out.println(sonTwo);
        System.out.println(sonOne);
        System.out.println(mom);
        System.out.println(father);
        System.out.println(granmaTwo);
        System.out.println(granmaOne);
        System.out.println(grandadTwo);
        System.out.println(grandadOne);
    }

    public static class Human
    {
       String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age,Human mother, Human father)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString()
        {
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
