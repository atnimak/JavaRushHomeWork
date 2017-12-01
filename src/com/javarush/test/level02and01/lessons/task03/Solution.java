public class Solution { public static void main(String[] args) {

Woman Kate = new Woman();
Cat Murzik = new Cat();
Murzik.owner = Kate;
Dog Barbos = new Dog();
Barbos.owner = Kate;
Fish lucky = new Fish();
lucky.owner = Kate;

/*

Woman kate = new Woman();
Cat murzik = new Cat();
murzik.owner = kate;
Dog barbos = new Dog();
barbos.owner = kate;
Fish lucky = new Fish();
lucky.owner = kate;

*/


}
public static class Cat
{
    public Woman owner;
}
public static class Dog
{
    public Woman owner;
}
public static class Fish
{
    public Woman owner;
}
public static class Woman
{
}
}