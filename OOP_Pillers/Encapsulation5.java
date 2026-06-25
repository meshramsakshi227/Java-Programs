class Mobile
{
    private String brand;

    Mobile(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }
}

public class Encapsulation5
{
    public static void main(String[] args)
    {
        Mobile m = new Mobile("Samsung");

        System.out.println(m.getBrand());
    }
}