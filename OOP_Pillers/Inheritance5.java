//Hybrid Inheritance
//Hierarchical + Multiple using interface
class Animal {
    void eat() 
    {
        System.out.println("Animal eats");
    }
}

interface Pet 
{
    void friendly();
}

class Dog extends Animal implements Pet {
    public void friendly() 
    {
        System.out.println("Dog is friendly");
    }
}

class Cat extends Animal implements Pet {
    public void friendly() 
    {
        System.out.println("Cat is friendly");
    }
}
public class OOP6_2_6 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.eat();
        d.friendly();

        Cat c = new Cat();
        c.eat();
        c.friendly();
    }
}
