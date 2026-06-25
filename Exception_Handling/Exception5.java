//Program without static key word for throws

import java.util.Scanner;
public class Exception5 {
     // Non-static method  
void checkAge(int age) throws Exception {  
    if (age < 18) {  
        throw new Exception("Not eligible to vote");  
    }  
    System.out.println("Eligible to vote");  
}  

public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);  

    System.out.print("Enter age: ");  
    int age = sc.nextInt();  

    Exception5 obj = new Exception5();  // object created  

    try {  
        obj.checkAge(age);   // calling non-static method  
    } catch (Exception e) {  
        System.out.println(e.getMessage());  
    } finally {  
        System.out.println("Program finished");  
    }  

    sc.close();  
}

}

