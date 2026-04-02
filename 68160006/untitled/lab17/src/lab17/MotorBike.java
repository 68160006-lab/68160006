package lab17;

class MotorBike implements Vehicle {  
int speed;  
int gear;  
       public void changeGear(int n){          
   gear = n;  
}  
public void speedUp(int increment){          
  speed = speed + increment;  
      }  
public void applyBrakes(int decrement){           
 speed = speed - decrement;  
      }  
      public void printStates() {  
System.out.println("speed: " + speed  + " gear: " + gear);  
     }  
} 

