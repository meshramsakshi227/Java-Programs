//Package
/*
Package -
 1. Build in package
 2. Self made package 
*/
package AccountInfo;

public class Account {
    String Name;
    double Balance;

public void Information(String name, double bal){
        this.Name = name;
        this.Balance = bal;
    }
    public void Display(){
        System.out.println("Account name: " + Name);
        System.out.println("Balance: " + Balance);
    }
    public void Deposit(double amount){
        if(amount>0){
            Balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    public void Withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance -= amount;
            System.out.println("Withdraw: " + amount);
        }else{
            System.out.println("Insufficient Balance...");
        }
    }
}
