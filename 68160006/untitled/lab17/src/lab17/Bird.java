package lab17;

class Bird extends Animal implements Flyable { 
	 
	   public void takeOff(){ 
	     System.out.println("Take off in Bird style."); 
	   } 
	   public void landing(){  
	      System.out.println("Landing in Bird style."); 
	   } 
	   public void fly(){ 
	      System.out.println("Fly in Bird style."); 
	   } 
	} 

