class PrePostincrement
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        System.out.println("a == "+(a++));
        System.out.println("a == "+(++a));
        System.out.println("a == "+(a));
        System.out.println("b == "+(b++));
        System.out.println("b == "+(++b));
        System.out.println("b == "+(+b));
        System.out.println("a == "+(a++ + ++a));
        System.out.println("c == "+(++a + a++ + --a));
        System.out.println("c == "+(a++ + ++b + ++a + b++));

    }
}
