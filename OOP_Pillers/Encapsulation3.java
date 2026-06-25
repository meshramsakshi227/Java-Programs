class Employee
{
    private int salary;

    public void setSalary(int salary)
    {
        if(salary > 0)
            this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }
}

public class Encapsulation3
{
    public static void main(String[] args)
    {
        Employee e = new Employee();

        e.setSalary(25000);

        System.out.println(e.getSalary());
    }
}