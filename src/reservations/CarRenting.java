package reservations;

import java.io.Serializable;

public class CarRenting implements Serializable {

    public String ModelNumber;

    public int DaysOfRenting;
    
    public float price;
    
    public boolean IsRented;
    
    public CarRenting(){
    	ModelNumber="";
    	DaysOfRenting=0;
    	IsRented=false;
    	price=0;
    }
}
