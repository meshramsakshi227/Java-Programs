//Multiple Inheritance
//for multiple Inherfaces with class we use interfaces
interface Father 
{
    void show();
}

interface Mother 
{
    void display();
}

class Child implements Father, Mother 
{
    public void show() {
        System.out.println("Father method");
    }

    public void display() 
    {
        System.out.println("Mother method");
    }
}

public class OOP6_2_5 
{
    public static void main(String[] args) 
    {
        
        Child c = new Child();
        c.show();
        c.display();
    }

}