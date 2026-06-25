//Write a java program to perform addition, subtraction, multiplication and division using switch statement.
public class Cal_switch 
{
    public static void main(String[] args) 
    {

        int a = 20, b = 5;
        int operation = 1;

        switch (operation) 
        {
            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}