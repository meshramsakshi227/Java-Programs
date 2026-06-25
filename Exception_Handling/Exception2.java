import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50, 60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index in Array: ");
        int index = sc.nextInt();
    
       try{
        System.out.println("Elements= "+arr[index]);
       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error invalid index");
       }
       finally{
        System.out.println("Programs ends...");
       }
    sc.close();
    }
}

