package java09_6;

public class Account {
	   int accId;
	   double balance;
	   static int count=0;
	   public Account(double balance) {
		  increaseCount();
	      this.accId = count;
	      this.balance = balance;
	   }
	   public Account() {
	      increaseCount();
	      this.accId = count;
	      this.balance = 0.0;  
	   }
	   public void increaseCount() {
		   count++;
	   }
	   public static void setCount(int c) {
		   count = c;
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