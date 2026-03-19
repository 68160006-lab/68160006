package lab13;

class Bicycle  {      int gear;      
int speed;  
    public Bicycle(int gear, int speed) {          
        this.gear = gear;          
        this.speed = speed;  
    }  
    public void applyBrake(int n) {            
        speed -= n;  
    }  
    public void speedUp(int n) {          
        speed += n;  
    }  
    public String toString()  {  
        return("No of gears are "+gear  + " , speed of bicycle is "+speed);  
    }   
} 

