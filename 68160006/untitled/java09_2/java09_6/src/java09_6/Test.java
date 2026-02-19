package java09_6;

public class Test {
	   public static void main(String[] args) {

	      Account a1 = new Account(100);
	      Account a2 = new Account();
	      
	      a1.display();
	      a2.display();  

	      a2.setBalance(2000);
	      
	      a1.display();     
	      a2.display();
	      
	      a1.deposit(500);

	      a1.display();     
	      a2.display();
	      
	      a2.withdraw(200);
	 
	      a1.display();     
	      a2.display();
	      
	      Account.setCount(20);
	      
	      Account a3 = new Account();
	      Account a4 = new Account(700);

	      a1.display();     
	      a2.display();
	      a3.display();     
	      a4.display();  
	      
	    }
	}
