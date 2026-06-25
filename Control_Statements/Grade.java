//Write a Java program to calculate grade.
public class Grade 
{
    public static void main(String[] args) 
    {
        int marks = 99;      // change value
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 70)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Grade = " + grade);
    
}
}
