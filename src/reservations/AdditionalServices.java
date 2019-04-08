package reservations;
import java.io.Serializable;


public class AdditionalServices implements Serializable {

    public boolean spa;

    public boolean TennisTable;

    public boolean JetSki;

    public boolean snorkling;

    public CarRenting car;
    
   public AdditionalServices(){
	   car =new CarRenting();
	   spa=false;
	   JetSki=false;
	   snorkling=false;
	   TennisTable=false;   
   }

	
}
