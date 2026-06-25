//Polymorphism - Function overriding
class Student
{
    public void printInfo()
    {
        System.out.println("I am a Student");
    }
}

class CollegeStudent extends Student
{
    public void printInfo()
    {
        System.out.println("I am a AI and Data Science Student");
    }
}
public class Polymorphism_run1 {

    public static void main(String args[])
    {
        Student s1 = new CollegeStudent();
        s1.printInfo();
    }
}