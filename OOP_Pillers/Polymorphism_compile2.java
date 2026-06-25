class Addition
{
    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }
}
public class Polymorphism_compile2 {
 
    public static void main(String[] args)
    {
        Addition a = new Addition();

        a.add(10, 20);
        a.add(10, 20, 30);
    }
}