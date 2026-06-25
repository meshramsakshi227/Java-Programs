class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2)               //Copy Constructors
    {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student()
    {

    }
}

public class OOP5
{
    public static void main (String args[])
    {
        Student s1 = new Student();      
        s1.name = "Sakshi";
        s1.age = 18;

        Student s2 = new Student(s1);
        s1.printInfo();
        s2.printInfo();

    }
}

