package lab17;

public class Test { 
	  public static void main(String[] args) { 
	    Object[] objects = {new Tiger(), new Chicken(), new Apple()};     
	    for (int i = 0; i < objects.length; i++)       
	          showObject(objects[i]); 
	  } 

	  public static void showObject(Object object) { 
	    if (object instanceof Edible) 
	      System.out.println(((Edible)object).howToEat()); 
	  } 
	} 


