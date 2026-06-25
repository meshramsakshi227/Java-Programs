//Static keyword
//data same for all in class common for all objects
class Student
{
    String name;
    static String School;
    {

    }
}
 
public class OOP6 
{
    public static void main(String args[]) 
    {
        Student.School = "ABC";

        Student s1 = new Student();
        s1.name = "Sakshi";

        System.out.println(s1.School);
        System.out.println(s1.name);
    }
}


