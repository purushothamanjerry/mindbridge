package day2;
class Account
{
    int accountNumber;
    double balance;
    Account(int num)
    {
        this.accountNumber=num;
        balance=0.00;
    }
    Account(int num,double balance)
    {
        this.accountNumber=num;
        this.balance=balance;
    }
    void DisplayAccountDetails()
    {
        System.out.println("*****************************************");
        System.out.println("AccountNumber : "+this.accountNumber);
        System.out.println("Balance : "+this.balance);
    }
}
public class ConstructorOverload {
    public static void main(String[] args) {
      Account user1 = new Account(1001);
      Account user2 = new Account(1002,50000.0);
      user1.DisplayAccountDetails();
      user2.DisplayAccountDetails();
    }
}