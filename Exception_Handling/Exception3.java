import java.util.Scanner;
public class Exception3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int Age = sc.nextInt();
         try {
            if(Age < 18){
                throw new Exception("Not eligible to vote.");
            }
            System.out.println("Eligible to volte.");
         } catch (Exception e) {
            System.out.println(e.getMessage());    //(e.getMessage()) - for clean output
         }                                         //(e) - it gives Package name and class name
         finally{
            System.out.println("Program finished.");
         }
         sc.close();
        }
    }

