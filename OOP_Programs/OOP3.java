class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student()                         //Constructors
    {
        System.out.println("Constructor called");
    }
}

public class OOP3
{
    public static void main (String args[])
    {
        Student s1 = new Student();    
        s1.name = "Sakshi";
        s1.age = 18;

        s1.printInfo();

    }
}

/*Constructors - Similar to function
1. Non Parametric Constructors
   - No parameter
   - No return type
   - One object - one call
2. Copy Constructors
*/
