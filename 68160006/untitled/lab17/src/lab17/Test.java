package lab17;

class Test { 
	   public static void main(String[] args) {       
	     Bird b = new Bird();       
	     b.eat();       
	       b.takeOff(); 
	      b.fly(); 
	      b.landing(); 
	      Airplane a = new Airplane();        
	      a.speedUp(20); 
	      a.speedUp(50); 
	      a.takeOff(); 
	      a.fly(); 
	      a.speedDown(40); 
	      a.landing(); 
	       Animal m = new Bird();       
	      m.eat(); 
	      m.takeOff(); 
	        ((Bird) m).takeOff();       
	      m = new Horse();       
	      m.eat(); 
	      m.takeOff(); 
	         ((Bird) m).takeOff(); 
	        ((Horse) m).takeOff(); 
	       Object x = new Airplane(); 
	      x.fly(); 
	        ((Airplane) x).fly(); 
	        ((Bird) x).fly(); 
	      x = new Horse();        
	       x.eat(); 
	         ((Horse) x).eat(); 
	     }  
	}

