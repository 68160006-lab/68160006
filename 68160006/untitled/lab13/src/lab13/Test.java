package lab13;

public class Test  {  
    public static void main(String args[])  {     
        MountainBike mb = new MountainBike(4, 70, 15);         
     mb.speedUp(5);         
     mb.setHeight(10);        
     mb.applyBrake(20);  
        System.out.println(mb.toString());  
    }  
} 

