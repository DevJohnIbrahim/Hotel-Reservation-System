package humans;
import java.io.*;

import interfaces.IModify;


public class Security extends Employee implements Serializable{
	
    public String WeaponType;
    
    public Security(){
    	super();
    	WeaponType="";
    }
}
