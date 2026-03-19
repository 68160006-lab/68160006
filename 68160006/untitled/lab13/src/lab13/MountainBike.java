package lab13;

class MountainBike extends Bicycle  {  
    int seatHeight;  
   public MountainBike(int gear,int speed,  int startHeight) {          
       super(gear, speed);          
       seatHeight = startHeight;  
   }   
 public void setHeight(int h) {            
       seatHeight = h;  
   }        
 public String toString() {  
       return (super.toString()+ ", seat height is "+ seatHeight);  
   } 
} 


