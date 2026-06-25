class Car
{
    private String Car_name;
    private int Car_cost;

    void setname(String name)
    {
        Car_name = name;
    }
    void setcost(int cost)
    {
        Car_cost = cost;
    }
    String getname()
    {
        return this.Car_name;
    }
    int getcost()
    {
        return this.Car_cost;
    }
}
public class OOP7
{
    public static void main(String[] args) 
    {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.setname("BMW");
        c1.setcost(11500000);
        c2.setname("Mercedes");
        c2.setcost(13000000);
        System.out.println("First Car c1 name:" + c1.getname());
        System.out.println("First Car c1 cost :" + c1.getcost());
        System.out.println("Second Car c2 name :" + c2.getname());
        System.out.println("Second Car c2 cost :" + c2.getcost());

    }
}
