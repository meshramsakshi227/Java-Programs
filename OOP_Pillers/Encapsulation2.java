class Student 
{
    private String name;     // data hiding
    private int age;

    // Setter method
    public void setName(String name) 
    {
        this.name = name;
    }

    // Getter method
    public String getName() 
    {
        return name;
    }

    // Setter method
    public void setAge(int age)  
    {
        this.age = age;
    }

    // Getter method
    public int getAge() 
    {
        return age;
    }
}

public class OOP6_3 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();

        // setting values using setter
        s1.setName("Sakshi");
        s1.setAge(18);

        // getting values using getter
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
