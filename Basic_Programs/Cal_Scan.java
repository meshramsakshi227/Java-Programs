import java.util.*;
public class Cal_Scan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 10 && b > 10): " + (a > 10 && b > 10));
        System.out.println("(a > 10 || b > 10): " + (a > 10 || b > 10));

        // Assignment Operator
        System.out.println("\n--- Assignment Operators ---");
        a += 5;
        System.out.println("After a += 5 → a = " + a);

        // Increment / Decrement
        System.out.println("\n--- Increment / Decrement ---");
        a++;
        b--;
        System.out.println("a++ = " + a);
        System.out.println("b-- = " + b);

        // Ternary Operator
        System.out.println("\n--- Ternary Operator ---");
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}