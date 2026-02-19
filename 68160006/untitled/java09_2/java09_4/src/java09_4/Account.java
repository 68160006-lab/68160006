package java09_4;

public class Account {
	   int accId;
	   double balance;

	   public Account(int accId, double balance) {
	      this.accId = accId;
	      this.balance = balance;
	   }
	   public Account(int accId) {
	      this.accId = accId;
	      this.balance = 0.0;  
	   }
	   public void setBalance(double balance) {
	      this.balance = balance;
	   }
	   public void deposit(double amount) {
	      balance = balance + amount;
	   }
	   public void withdraw(double amount) {
	      if (balance < amount) {
	         System.out.println("Not enough money to withdraw!!");
	      } else {
	         balance = balance - amount;
	      }
	   }
	   public void display() {
	     System.out.println("A/C no: " + accId + " Balance = " + balance);
	   }
	}