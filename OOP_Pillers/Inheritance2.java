//Multi level Inheritance
//Grandparent - parent - child
class Animal
{
    void eat()
    {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog
{
    void weep()
    {
        System.out.println("Puppy weeps");
    }
}

public class OOP6_2_3 
{
    public static void main(String[] args)
    {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
