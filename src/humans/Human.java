package humans;

import java.io.Serializable;

public class Human implements Serializable{

    public String FirstName;
    
    public String LastName;

    public int Age;
    
    public String Gender;
    
    public String ID;
    
    public Human(){
    	FirstName="";
    	LastName="";
    	Age=0;
    	Gender="";
    	ID="";
    }
    

}
