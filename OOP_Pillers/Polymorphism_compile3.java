class Student
{
    Student()
    {
        System.out.println("Default Constructor");
    }

    Student(String name)
    {
        System.out.println("Name: " + name);
    }
}
public class Polymorphism_compile3 {

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Sakshi");
    }
}