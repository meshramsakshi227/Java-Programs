//Abstraction
interface Animal             //interface keyword
{
    int eyes = 2;             //value is fixed can`t be change(static) and public
    public void walk();         //public - if we do not use then also it will be default
}
interface Herbivore
{

}
class Horse implements Animal, Herbivore         //this can be done by interface not by class
{
    public void walk()      //public is default
    {
        System.out.println("Walk on 4 legs");
    }
}
public class Abstraction2 
{
    public static void main(String arg[])
    {
        Horse h = new Horse();
        h.walk();
    }
}
