class Person
{
    void profession()
    {
        System.out.println("Person");
    }
}

class Teacher extends Person
{
    void profession()
    {
        System.out.println("Teacher");
    }
}
public class Polymorphism_run2 {

    public static void main(String args[])
    {
        Person p = new Teacher();
        p.profession();
    }
}