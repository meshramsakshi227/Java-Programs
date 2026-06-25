//Exception is runtime errror
//We use Exception so that their is no Crach.
/*
try - A block where riskey code is written
catch - Use to handle the error
finally - This block always executes
throw - Used to manually create an exception
throws - Used in method declaration to declare exceptions
*/
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int Result;
        int a, b;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of a: ");
            a = sc.nextInt();
            System.out.println("Enter value of b: ");
            b = sc.nextInt();
        
        try {
            Result = (a/b);
            System.out.println("Result = "+Result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program Ends...");
            sc.close();    //Good practice to close Scanner.
        }

    }
}
