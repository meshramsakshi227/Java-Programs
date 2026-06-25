//Write a java program to find largest amoung three number.
public class Large_3 
{
    public static void main(String[] args) 
    {

        int a = 10, b = 25, c = 15;

        int largest;

        if (a >= b && a >= c)
            largest = a;
        else if (b >= a && b >= c)
            largest = b;
        else
            largest = c;

        System.out.println("Largest = " + largest);
    
}
}
