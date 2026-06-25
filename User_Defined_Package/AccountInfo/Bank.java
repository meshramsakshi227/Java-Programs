package AccountInfo;

public class Bank {
    public static void main(String args[])
    {
        Account ac1 = new Account();
        ac1.Information("Sakshi", 200000);
        ac1.Display();

        ac1.Deposit(20000);
        ac1.Withdraw(10000);
        ac1.Display();

       Account ac2 = new Account();
       ac2.Information("Sarthak", 150000);
       ac2.Display(); 
}
}
