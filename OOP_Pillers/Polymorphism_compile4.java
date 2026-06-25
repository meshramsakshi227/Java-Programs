class Mobile
{
    void details(String brand)
    {
        System.out.println("Brand: " + brand);
    }

    void details(String brand, int price)
    {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Polymorphism_compile4 {
 
    public static void main(String[] args)
    {
        Mobile m = new Mobile();

        m.details("Samsung");
        m.details("Samsung", 15000);
    }
}