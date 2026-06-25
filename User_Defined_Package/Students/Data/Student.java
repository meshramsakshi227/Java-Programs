   package Students.Data;

public class Student {
    int RollNo;
    String Name;
    int Mark1, Mark2, Mark3;

    public Student(int rollNo, String name, int m1, int m2, int m3){
        this.RollNo = rollNo;
        this.Name = name;
        this.Mark1 = m1;
        this.Mark2 = m2;
        this.Mark3 = m3;
    }
    public int CalculateTotal(){
        int Total = Mark1 + Mark2 + Mark3;
        return Total;
    }
    public int CalculatePercentage(){
        return CalculateTotal()/3;
    }
    public void DisplayDetails(){
        System.out.println("Roll No: "+RollNo);
        System.out.println("Name: "+Name);
        System.out.println("Total Marks: "+CalculateTotal());
        System.out.println("Percentage: "+CalculatePercentage());
    }
}




