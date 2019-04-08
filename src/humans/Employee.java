package humans;

import java.io.Serializable;

import reservations.Date;

public class Employee extends Human implements Serializable{

    public Date EmploymentDate;
    
    public Employee(){
    	super();
    	EmploymentDate=new Date();
    }
}
