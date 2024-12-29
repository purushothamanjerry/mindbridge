package day2;

public class BankAccount {
	
	    private String accountNumber;
	    private double balance;

	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public double checkBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("123456789", 5000);

	        System.out.println("Account Number: " + account.accountNumber);
	        System.out.println("Initial Balance: $" + account.checkBalance());

	        account.deposit(1500);
	        System.out.println("Current Balance: $" + account.checkBalance());

	        account.withdraw(2000);
	        System.out.println("Current Balance: $" + account.checkBalance());

	        account.withdraw(5000); // Attempt to withdraw more than the balance
	    }
	}


	 

}
