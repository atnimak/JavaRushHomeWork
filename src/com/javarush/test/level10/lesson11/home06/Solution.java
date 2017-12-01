package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name = "";
        String lastname = "";
        String nickname = "";

        int age = 0;
        int hight = 0;
        int weight = 0;

        public Human (String name){
            name = this.name;
        }

        public Human (String name, String lastname){
            name = this.name;
            lastname = this.lastname;
        }

        public Human (String name, String lastname, String nickname){
            name = this.name;
            lastname = this.lastname;
            nickname = this.nickname;
        }

        public Human (String name, int age){
            name = this.name;
            age = this.age;
        }

        public Human (String name, String lastname, int age){
            name = this.name;
            lastname = this.lastname;
            age = this.age;
        }

        public Human (String name, String lastname, String nickname, int age){
            name = this.name;
            lastname = this.lastname;
            nickname = this.nickname;
            age = this.age;
        }



        public Human (String name, String lastname, String nickname, int age, int hight )
        {
            name = this.name;
            lastname = this.lastname;
            nickname = this.nickname;
            age = this.age;
            hight = this.hight;
        }

        public Human (String name, String lastname, int age, int hight ){
            name = this.name;
            lastname = this.lastname;
            age = this.age;
            hight = this.hight;
        }

        public Human (String name, String lastname, int age, int hight, int weight ){
            name = this.name;
            lastname = this.lastname;
            age = this.age;
            hight = this.hight;
            weight = this.weight;
        }

        public Human (String name, String lastname, String nickname, int age, int hight, int weight )
        {
            name = this.name;
            lastname = this.lastname;
            nickname = this.nickname;
            age = this.age;
            hight = this.hight;
            weight = this.weight;
        }

    }
}
