package java09_4;

public class Test {
	   public static void main(String[] args) {

	      Account a1 = new Account(123, 100);
	      Account a2 = new Account(888);
	      
	      a1.display();
	      a2.display();  

	      a2.setBalance(2000);
	      
	      a1.display();     
	      a2.display();
	      
	      a1.deposit(500);

	      a1.display();     
	      a2.display();
	      
	      a1.withdraw(200);
	 
	      a1.display();     
	      a2.display();
	      
	      a2.withdraw(3000);
	      
	      a1.display();     
	      a2.display();

	    }
	}
