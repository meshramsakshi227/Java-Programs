/*Static
  - it is used so that method can be called without object
  - main() must be static because JVM calls it directly
  - methods are made static to call them easily from main
  - its is not compulsory to use static keyword for throws
..............................................................
*/
//Program with static keyword for throws

import java.util.Scanner;
public class Exception4 {
    // Static method
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);   // direct call (no object needed)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }

        sc.close();
    }
}

