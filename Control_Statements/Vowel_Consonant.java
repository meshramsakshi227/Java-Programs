//Write a java program to check whether is vowel or consonant.
public class Vowel_Consonant 
{
    public static void main(String[] args) 
    {

        char ch = 'S'; // change letter

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("Vowel");
        else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
            System.out.println("Consonant");
        else
            System.out.println("Not an alphabet");
    
}
}
