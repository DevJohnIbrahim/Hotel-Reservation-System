package humans;
import java.io.*;

import interfaces.IModify;

public class RoomCleaner extends Employee implements Serializable {

   public String Shifts;
   public String MasterkeyNO;
   
   public RoomCleaner(){
	   super();
	   MasterkeyNO="";
	   Shifts="";
   }
   

}
