package lab16;

public class Cat extends Pet{ 
	 
    public Cat() { 
	        super(); 
	           System.out.println("Cat"); 
	} 
	public Cat(String n, int w) {  	 	  
       super(n,w); 
	} 
    public String makeNoise() { 
	          return "Meow Meow"; 
	} 
    public String toString() {      
       return "Cat Name : " + getName() + "\n" + "Weight : "+ getWeight() + "\n"+ "MakeNoise : " + makeNoise() + "\n"; 
      } 
} 
 

