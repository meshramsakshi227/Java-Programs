//Inharitance
class Shape             //Base, Parent class
{
    String colour;
}
class Triangle extends Shape      //Subclass child
{

}
public class _ 
{
    public static void main(String[] args) 
    {
       Triangle t1 = new Triangle();
       t1.colour = "red"; 
    }
}

/*
Inheritance - 1 class properties to another class
 1.Single level Inheritance
  base class to Derived class
 2.Multi level Inheritance
  base class to Derived class to Derived class
 3.Hierarchial Inheritance
  base class to Derived 1 class, base class to Derived 2 class
 4.Hybrid Inheritance
  base class to Derived 1 class, base class to Derived 2 class to Derived class
 -.Multiple Inheritance
  Interphase
*/