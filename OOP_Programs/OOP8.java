class Student
{
    private String Student_name;
    private int Student_roll_no;
    void setname(String name)
    {
        Student_name = name;
    }
    void setroll_no(int roll_no)
    {
        Student_roll_no = roll_no;
    }
    String getname()
    {
        return this.Student_name;
    }
    int getroll_no()
    {
        return this.Student_roll_no;
    }
}

class OOP8
{
    public static void main(String[] args) 
    {
       Student s1 = new Student(); 
       Student s2 = new Student();
       s1.setname("Sakshi");
       s1.setroll_no(168);

       s2.setname("Samruddhi");
       s2.setroll_no(169);

       System.out.println("First Student s1 name:" + s1.getname());
       System.out.println("First Student s1 roll_no:" + s1.getroll_no());
       System.out.println("Second Student s2 name:" + s2.getname());
       System.out.println("Second Student s2 roll_no:" + s2.getroll_no());
    }
}