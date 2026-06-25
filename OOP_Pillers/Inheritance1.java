//Single level Inheritance type 1
//One child inherits from one parent
class Dog extends Animal
 {
    void bark()
    {
        System.out.println("Dog barks");
    }
 }
public class OOP6_2_2_1 
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();    //from parent
        d.bark();    //from child
    }
}
