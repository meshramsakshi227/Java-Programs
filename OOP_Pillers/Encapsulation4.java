class Book
{
    private String title;
    private int price;

    public void setData(String title, int price)
    {
        this.title = title;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Encapsulation4
{
    public static void main(String[] args)
    {
        Book b = new Book();

        b.setData("Java", 500);

        b.display();
    }
}