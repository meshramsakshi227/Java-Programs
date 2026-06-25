class Book
{
    String title;
    int price;

    Book()
    {
        title = "Java Programming";
        price = 500;
    }

    void show()
    {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
public class OOP2{

    public static void main(String args[])
    {
        Book b1 = new Book();

        b1.show();
    }
}