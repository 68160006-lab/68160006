package lab17;

class Airplane extends Vehicle implements Flyable { 
	 
	   public void takeOff(){  
	     System.out.println("Take off in Airplane style."); 
	   } 
	   public void landing(){  
	     System.out.println("Landing in Airplane style."); 
	   } 
	   public void fly(){ 
	     System.out.println("Fly in Airplane style."); 
	   } 
	} 

