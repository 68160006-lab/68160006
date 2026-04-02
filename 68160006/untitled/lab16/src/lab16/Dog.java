package lab16;

public class Dog extends Pet{ 
	 
 	public Dog() { 
 	 	super(); 
 	 	System.out.println("Dog"); 
 	} 
 	public Dog(String n, int w) { 
 	 	super(n,w); 
 	} 
 	public String makeNoise() { 
 	 	return "Hong Hong"; 
 	} 
           public String toString() {      
               return "Dog Name : " + getName() + \n" + 
 "Weight : "+ getWeight() + "\n" + "MakeNoise : " + makeNoise() + "\n"; 
    } 
} 
 


