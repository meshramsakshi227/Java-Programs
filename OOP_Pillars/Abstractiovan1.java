/*
OOP concept(Pillar)
1.Polymorphism
  1.Function overloading
  2.Function overwritting
2.Inheritance
3.Encapsulation
4.Abstraction
 */

//Abstraction
//show user important things hide garbage
abstract class Animal      //abstract keyword
{
    public void walk()
    {

    }
}
class Horse extends Animal
{
    public void walk()
    {
        System.out.println("Walk on four legs");
    }
}
class Chicken extends Animal
{
    public void walk()
    {
        System.out.println("Walk on two legs");
    }

}
public class Abstraction1 
{
    public static void main(String arg[])
    {
        Horse h = new Horse();
        h.walk();

        Chicken c = new Chicken();
        c.walk();
    }
}
/*
can implement by
    abstract - keyword
    interfaces - keyword
 */
