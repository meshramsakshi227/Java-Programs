class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age)               //Parametric Constructors
    {
        this.name = name;
        this.age = age;
    }
}

public class OOP4
{
    public static void main (String args[])
    {
        Student s1 = new Student("Sakshi",18);      
        
        s1.printInfo();

    }
}
