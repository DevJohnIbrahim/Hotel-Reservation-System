package humans;
import java.io.*;

import interfaces.IModify;

public class Transporter extends Employee implements Serializable{
	
    public String DrivingLicence;
    
    public Transporter(){
    	super();
    	DrivingLicence="";
    }
    
}
