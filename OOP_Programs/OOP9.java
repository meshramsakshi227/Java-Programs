//AccessModifiers

class Account
{
    public String name;
    protected String email;
    private String password;

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
}
public class OOP9 
{
    public static void main(String[] args) 
    {
        Account ac1 = new Account();
        ac1.name = "SHS";
        ac1.email = "sacredheart@gmail.com";
        ac1.setPassword("1234567");      //use setter for private field
        System.out.println(ac1.name + " | " + ac1.email + " | " + ac1.getPassword());
    }
} 
