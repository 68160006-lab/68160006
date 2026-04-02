package lab16;

public abstract class Pet {     
    private String name; 
    private double weight; 
     
           public Pet() { 
                       System.out.println("Pet"); 
           } 
           public Pet(String n, int w) {      	            name = n;      	
                    weight = w; 
           } 
 	public String getName() { 
 	 	return name; 
 	} 
 	public void setName(String name) { 
 	 	this.name = name; 
 	} 
 	public double getWeight() { 
 	 	return weight; 
 	} 
 	public void setWeight(int weight) { 
 	 	this.weight = weight; 
 	} 
 	public void setWeight(double weight) { 
 	 	this.weight = weight; 	 	 
 	} 
 	 
 	public abstract String makeNoise(); 
 	 
          public String toString() {      
            return "Name : " + name + "\n" + "Weight : "+ weight + "\n"; 
          } 
} 
