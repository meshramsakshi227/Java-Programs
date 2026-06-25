package BankInfo;

public class Account extends Bank{
    public static void main(String[] args) 
    {
        Account ac1 = new Account();
        ac1.name = "SHS";
        ac1.email = "sacredheart@gmail.com";
        
        ac1.setPassword("abcd");
        System.out.println("Name: "+ac1.name);
        System.out.println("Email: "+ac1.email);
        System.out.println("Password: "+ac1.getPassword());
    } 
}

