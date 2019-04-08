package humans;
import java.io.*;

import interfaces.IModify;
import reservations.Date;

public class Guest extends Human  implements Serializable {

   public Date CheckInDate;

   public Date CheckOutDate;

   public int DepositLeft;

   public Guest(){
	   super();
	   CheckInDate=new Date(); 
	   CheckOutDate=new Date();
	   DepositLeft=0;
   }
   
   
}

