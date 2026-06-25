package Students1.Data1;

public class Student1 {
    String Name;
    int Roll_No;
    int Mark1, Mark2, Mark3;
    int Total = Mark1 + Mark2 + Mark3;
    double Percentage = (Total)/3;

   public void display() {
      System.out.println("Name :"+Name);
      System.out.println("Roll No :"+Roll_No);
      System.out.println("Total :"+Total);
      System.out.println("Percentage :"+Percentage);
      System.out.println("Mark1 = "+Mark1);
      System.out.println("Mark2 = "+Mark2);
      System.out.println("Mark3 = "+Mark3);
   }
}


