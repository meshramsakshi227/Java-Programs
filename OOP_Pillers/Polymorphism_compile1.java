//Polymorphism - Function overloading
class Student
{
    String name;
    int age;

    public void printInfo(String name)      //print name
    {
        System.out.println(name);
    }
     public void printInfo(int age)                //print age
    {
        System.out.println(age);
    }
     public void printInfo(String name, int age)      //Overloaded method to print both name and age
    {
        System.out.println(name +" "+ age);
    }
}

public class Polymorphism_compile1 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.name = "Sakshi";
        s1.age = 18;

        s1.printInfo(s1.name, s1.age);         //Calling Overloaded method to print both name and age
    }
}

/*
Polymorphism - 
  1.Function overloading 
    - compile type - check while code is written
  2.Function overwritting
    - run type - check after program is done(run)
*/