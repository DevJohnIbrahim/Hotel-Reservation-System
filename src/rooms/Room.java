package rooms;
import java.io.Serializable;

import interfaces.IModify;

public class Room  implements Serializable{
	 
	public static enum RoomType_{Single,Double,Triple};

    public int RoomNumber;

    public int FloorNumber;

    public Bed BED;
    
    public RoomFacilites RoomF;

    public boolean IsReserved;
    
    public RoomType_ RoomType;
    
    public Room(){
    	BED =new Bed();
    	RoomF= new RoomFacilites();
    	FloorNumber=0;
    	IsReserved=false;
    	RoomNumber=0;
    }
 
}
