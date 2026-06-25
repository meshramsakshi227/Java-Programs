/*
(Scanner) Method   -    Use 
nextInt() - Integer input 
nextFloat() - Decimal input 
nextDouble() - Double input 
next() - Single word 
nextLine() - Full sentence 
next().charAt(0) - Character 
*/

// Input Integer and Print
import java.util.Scanner;
public class Scanner_2num {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two number:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.print("Entered numbers are:"+num1+" "+num2);
  }  
}