package reservations;
import java.io.Serializable;


public class Payment implements Serializable {

   public float amount;

   public String Method;
   
   public Payment(){
	   amount=0;
	   Method="";
   }
    

}
