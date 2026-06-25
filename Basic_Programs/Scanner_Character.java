import java.util.Scanner;
public class Scanner_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);       //for single word
        /*
            sc.next() - takes input as string.
            charAt(0) - Takes single character by using index.
        */
        System.out.print("Enter another character:");
        String str = sc.next();                //for hole word
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(2);

        System.out.print("Character is: " + ch+" "+ch1+" "+ch2+" "+ch3);
    }
}