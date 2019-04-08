package humans;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import Encrypt_Decrypt.Enc_Dec;
import interfaces.ILogin;
import interfaces.IModify;
import reservations.AdditionalServices;
import reservations.CarRenting;
import reservations.Payment;
import rooms.Room;

public class GeneralManager extends Human implements ILogin,IModify,Serializable {

    public String AdminID;
    
    public String AdminPassword;
    
    public int OfficeNumber;
   
    public GeneralManager(){
    	super();
    	AdminID="";
    	AdminPassword="";
    	OfficeNumber=0;
    	Enc_Dec.SetHashMap();
    }
   
    public boolean Login(String user,String Password) {
    	
    	  try {
    		  String decrypted=new String();
    		  ArrayList<GeneralManager> x=new ArrayList<GeneralManager>();
    		  int i=0;
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("GeneralManager.bin"));
              x=(ArrayList<GeneralManager>) st.readObject();
              st.close();
              
              while(x.size()>=i){
            	  decrypted=""+Enc_Dec.decryption(x.get(i).AdminPassword);
            	  if(x.get(i).AdminID.equals(user)&&decrypted.equals(Password)){
            		  return true;
            	  }
            	  i++;
              }
            
          } 
    	  catch (Exception ex) {
           ex.getMessage();
           return false;
          }
		return false;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    public void Add(){
    	
    }
    public void Add(Receptionist r){
    	
        ArrayList<Receptionist> arr =new ArrayList<Receptionist>();
        try {
           ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Receptionist.bin"));
           arr=(ArrayList<Receptionist>) st.readObject();
           st.close();
           
        } catch (Exception ex) {
         ex.getMessage();
        } 
        
        r.LogPassword=Enc_Dec.encryption(r.LogPassword);
        arr.add(r);
       
        try{
        ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Receptionist.bin"));
        st.writeObject(arr);
        st.close();
        }
        catch(Exception e){
            e.getMessage();
        }
    	
    }
    public void Add(Security s){
    
    	ArrayList<Security> arr1=new ArrayList<Security>();
    	try {
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Security.bin"));
             arr1=(ArrayList<Security>) st.readObject();
             st.close();
             
          } catch (Exception ex) {
           ex.getMessage();
          } 
          
          arr1.add(s);
          try{
          ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Security.bin"));
          st.writeObject(arr1);
          st.close();
          }
          catch(Exception e){
              e.getMessage();
          }
    }
    public void Add(GeneralManager gm){
    	 ArrayList<GeneralManager>  arr2=new ArrayList<GeneralManager>();
        
    	  try {
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("GeneralManager.bin"));
             arr2=(ArrayList<GeneralManager>) st.readObject();
             st.close();
             
          } catch (Exception ex) {
           ex.getMessage();
          } 
    	  gm.AdminPassword=Enc_Dec.encryption(gm.AdminPassword);
          arr2.add(gm);
          try{
          ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("GeneralManager.bin"));
          st.writeObject(arr2);
          st.close();
          }
          catch(Exception e){
              e.getMessage();
          }
    }
    public void Add(RoomCleaner rc){
    	
    	ArrayList<RoomCleaner>  arr3=new ArrayList<RoomCleaner>();

    	try {
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("RoomCleaner.bin"));
             arr3=(ArrayList<RoomCleaner>) st.readObject();
             st.close();
             
          } catch (Exception ex) {
           ex.getMessage();
          } 
          
          arr3.add(rc);
          try{
          ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("RoomCleaner.bin"));
          st.writeObject(arr3);
          st.close();
          }
          catch(Exception e){
              e.getMessage();
          }
    }
    public void Add(Guest g,Room r,AdditionalServices as,Payment p){
    	
    	 ArrayList<ArrayList<Object>> arr4=new ArrayList<>();
    		
    	try {
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
             arr4=(ArrayList<ArrayList<Object>>) st.readObject();
             st.close();
             
          } catch (Exception ex) {
           ex.getMessage();
          } 
    	ArrayList<Object> x=new ArrayList<>(); 
    	x.add(g);
    	x.add(r);
    	x.add(as);
    	x.add(p);
	    arr4.add(x);
	    
          try{
          ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Guest.bin"));
          st.writeObject(arr4);
          st.close();
          }
          catch(Exception e){
              e.getMessage();
          }
    }
    public void Add(Transporter t){
    	
    	ArrayList<Transporter>  arr5=new ArrayList<Transporter>();
        
    	try {
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Transporter.bin"));
             arr5=(ArrayList<Transporter>) st.readObject();
             st.close();
             
          } catch (Exception ex) {
           ex.getMessage();
          } 
          
          arr5.add(t);
          try{
          ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Transporter.bin"));
          st.writeObject(arr5);
          st.close();
          }
          catch(Exception e){
              e.getMessage();
          }
    }
    ////////////////////////////////////////////////////////////////////////////////////////
    public int Update() {
		return 0;
	}
    public int Update(Receptionist r){
    	
    	  ArrayList<Receptionist> arr =new ArrayList<Receptionist>();
        try {
            
        	 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Receptionist.bin"));
             arr=(ArrayList<Receptionist>) st.readObject();
             st.close();
             
        } catch (Exception ex) {
           ex.getMessage();
        }
          
          
        int index=-1;
        int i=0;
        while(arr.size()>i){
        if(arr.get(i).ID.equals(r.ID)){
        arr.remove(i);
        r.LogPassword=Enc_Dec.encryption(r.LogPassword);
        arr.add(r);
        index=i;
         }
        i++;
        }
        
        if(index==-1){
        return 0;
        }
        else{
         try{
       ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Receptionist.bin"));
       st1.writeObject(arr);
       st1.close();
       }
       catch(Exception e){
           e.getMessage();
           return 0;
       }
        }
         
         return 1;
     }
    public int Update(Security s){
    	  ArrayList<Security> arr1 =new ArrayList<Security>();
          try {
              
          	 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Security.bin"));
               arr1=(ArrayList<Security>) st.readObject();
               st.close();
               
          } catch (Exception ex) {
             ex.getMessage();
          }
            
            
          int index=-1;
          int i=0;
          while(arr1.size()>i){
          if(arr1.get(i).ID.equals(s.ID)){
          arr1.remove(i);
          arr1.add(s);
          index=i;
           }
          i++;
          }
          
          if(index==-1){
          return 0;
          }
          else{
           try{
         ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Security.bin"));
         st1.writeObject(arr1);
         st1.close();
         }
         catch(Exception e){
             e.getMessage();
             return 0;
         }
          }
           
           return 1;
     }
    public int Update(GeneralManager gm){
    	  ArrayList<GeneralManager> arr2 =new ArrayList<GeneralManager>();
          try {
              
          	 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("GeneralManager.bin"));
               arr2=(ArrayList<GeneralManager>) st.readObject();
               st.close();
               
          } catch (Exception ex) {
             ex.getMessage();
          }
            
            
          int index=-1;
          int i=0;
          while(arr2.size()>i){
          if(arr2.get(i).ID.equals(gm.ID)){
          arr2.remove(i);
          gm.AdminPassword=Enc_Dec.encryption(gm.AdminPassword);
          arr2.add(gm);
          index=i;
           }
          i++;
          }
          
          if(index==-1){
          return 0;
          }
          else{
           try{
         ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("GeneralManager.bin"));
         st1.writeObject(arr2);
         st1.close();
         }
         catch(Exception e){
             e.getMessage();
             return 0;
         }
          }
           
           return 1;
     }
    public int Update(RoomCleaner rc){
    	  ArrayList<RoomCleaner> arr3 =new ArrayList<RoomCleaner>();
          try {
              
          	 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("RoomCleaner.bin"));
               arr3=(ArrayList<RoomCleaner>) st.readObject();
               st.close();
               
          } catch (Exception ex) {
             ex.getMessage();
          }
            
            
          int index=-1;
          int i=0;
          while(arr3.size()>i){
          if(arr3.get(i).ID.equals(rc.ID)){
          arr3.remove(i);
          arr3.add(rc);
          index=i;
           }
          i++;
          }
          
          if(index==-1){
          return 0;
          }
          else{
           try{
         ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("RoomCleaner.bin"));
         st1.writeObject(arr3);
         st1.close();
         }
         catch(Exception e){
             e.getMessage();
             return 0;
         }
          }
           
           return 1;
     }
 
    public int Update(Guest g,Room r,AdditionalServices as,Payment p){
    	  ArrayList<ArrayList<Object>> arr4 =new ArrayList<ArrayList<Object>>();
          try {
              
          	 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
               arr4=(ArrayList<ArrayList<Object>>) st.readObject();
               st.close();
               
          } catch (Exception ex) {
             ex.getMessage();
          }
            
         ArrayList<Object> x=new ArrayList<>(); 
     	 x.add(g);
      	 x.add(r);
      	 x.add(as);
      	 x.add(p);
     	  
          int index=-1;
          int i=0;
          while(arr4.size()>i){
        	  Guest q=(Guest)arr4.get(i).get(0);
              
           if(q.ID.equals(g.ID)){
             arr4.remove(i);
      	     arr4.add(x);
              index=i;
           }
          i++;
          }
          
          if(index==-1){
          return 0;
          }
          else{
           try{
         ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Guest.bin"));
         st1.writeObject(arr4);
         st1.close();
         }
         catch(Exception e){
             e.getMessage();
             return 0;
         }
          }
           
           return 1;
     }
    
    public int Update(Transporter t){
    	  ArrayList<Transporter> arr5 =new ArrayList<Transporter>();
          try {
              
          	 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Transporter.bin"));
               arr5=(ArrayList<Transporter>) st.readObject();
               st.close();
               
          } catch (Exception ex) {
             ex.getMessage();
          }
            
            
          int index=-1;
          int i=0;
          while(arr5.size()>i){
          if(arr5.get(i).ID.equals(t.ID)){
          arr5.remove(i);
          arr5.add(t);
          index=i;
           }
          i++;
          }
          
          if(index==-1){
          return 0;
          }
          else{
           try{
         ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Transporter.bin"));
         st1.writeObject(arr5);
         st1.close();
         }
         catch(Exception e){
             e.getMessage();
             return 0;
         }
          }
           
           return 1;
	 }
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Delete(){
    	return 0;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Delete(String Emp,String PID){
    	////////////////////////////////////////////////////////////
    	if(Emp.equals("Receptionist")){
    		 ArrayList<Receptionist> arr=new ArrayList<Receptionist>();
      		
             try {
                 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Receptionist.bin"));
                arr=(ArrayList<Receptionist>) st.readObject();
                st.close();
             } catch (Exception ex) {
              ex.getMessage();
             } 
     		int index=-1;
             int i=0;
             while(arr.size()>i){
             if(arr.get(i).ID.equals(PID)){
             index=i;
             }
             i++;
             }
             
             if(index==-1){
                 return 0;
                 }
             else{
                     arr.remove(index);
                 }
             
            try{
            ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Receptionist.bin"));
            st1.writeObject(arr);
            st1.close();
            }
            catch(Exception e){
                e.getMessage();
                return 0;
            }
             
             return 1;
    		
    	}
    	///////////////////////////////////////////////////////////////
    	else if(Emp.equals("Security")){
    		 ArrayList<Security> arr1=new ArrayList<Security>();
      		
             try {
                 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Security.bin"));
                arr1=(ArrayList<Security>) st.readObject();
                st.close();
             } catch (Exception ex) {
              ex.getMessage();
             } 
     		int index=-1;
             int i=0;
             while(arr1.size()>i){
             if(arr1.get(i).ID.equals(PID)){
             index=i;
             }
             i++;
             }
             
             if(index==-1){
                 return 0;
                 }
             else{
                     arr1.remove(index);
                 }
             
            try{
            ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Security.bin"));
            st1.writeObject(arr1);
            st1.close();
            }
            catch(Exception e){
                e.getMessage();
                return 0;
            }
             
             return 1;
    		
    	}
    	/////////////////////////////////////////////////////////////////////
    	else if(Emp.equals("GeneralManager")){
    		 ArrayList<GeneralManager> arr2=new ArrayList<GeneralManager>();
     		
             try {
                 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("GeneralManager.bin"));
                arr2=(ArrayList<GeneralManager>) st.readObject();
                st.close();
             } catch (Exception ex) {
              ex.getMessage();
             } 
     		int index=-1;
             int i=0;
             while(arr2.size()>i){
             if(arr2.get(i).ID.equals(PID)){
             index=i;
             }
             i++;
             }
             
             if(index==-1){
                 return 0;
                 }
             else{
                     arr2.remove(index);
                 }
             
            try{
            ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("GeneralManager.bin"));
            st1.writeObject(arr2);
            st1.close();
            }
            catch(Exception e){
                e.getMessage();
                return 0;
            }
             
             return 1;
    		
    	}
    	///////////////////////////////////////////////////////////////////
    	else if(Emp.equals("RoomCleaner")){
           ArrayList<RoomCleaner> arr3=new ArrayList<RoomCleaner>();
    		
            try {
                ObjectInputStream  st = new ObjectInputStream(new FileInputStream("RoomCleaner.bin"));
               arr3=(ArrayList<RoomCleaner>) st.readObject();
               st.close();
            } catch (Exception ex) {
             ex.getMessage();
            } 
    		int index=-1;
            int i=0;
            while(arr3.size()>i){
            if(arr3.get(i).ID.equals(PID)){
            index=i;
            }
            i++;
            }
            
            if(index==-1){
                return 0;
                }
            else{
                    arr3.remove(index);
                }
            
           try{
           ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("RoomCleaner.bin"));
           st1.writeObject(arr3);
           st1.close();
           }
           catch(Exception e){
               e.getMessage();
               return 0;
           }
            
            return 1;
    		
    	}
    	//////////////////////////////////////////////////////////////////
    	else if(Emp.equals("Guest")){
    		
    		ArrayList<ArrayList<Object>> arr4=new ArrayList<ArrayList<Object>>();
    		
            try {
                ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
               arr4=(ArrayList<ArrayList<Object>>) st.readObject();
               st.close();
            } catch (Exception ex) {
             ex.getMessage();
            } 
            
    		int index=-1;
            int i=0;
            while(arr4.size()>i){
            	  Guest q=(Guest)arr4.get(i).get(0);
                  
                  if(q.ID.equals(PID)){
                  arr4.remove(i);
                  index=i;
                  }
                  i++;
                  }
                  
                  if(index==-1){
                      return 0;
                      }
            
           try{
           ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Guest.bin"));
           st1.writeObject(arr4);
           st1.close();
           }
           catch(Exception e){
               e.getMessage();
               return 0;
           }
            
            return 1;
    	}
    	////////////////////////////////////////////////////////////////////
    	else if(Emp.equals("Transporter")){

    		ArrayList<Transporter> arr5=new ArrayList<Transporter>();
    		
            try {
                ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Transporter.bin"));
               arr5=(ArrayList<Transporter>) st.readObject();
               st.close();
            } catch (Exception ex) {
             ex.getMessage();
            } 
    		int index=-1;
            int i=0;
            while(arr5.size()>i){
            if(arr5.get(i).ID.equals(PID)){
            index=i;
            }
            i++;
            }
            
            if(index==-1){
                return 0;
                }
            else{
                    arr5.remove(index);
                }
            
           try{
           ObjectOutputStream st1=new ObjectOutputStream(new FileOutputStream("Transporter.bin"));
           st1.writeObject(arr5);
           st1.close();
           }
           catch(Exception e){
               e.getMessage();
               return 0;
           }
            
            return 1;
    		
    	}
    	
    	return 0;
     }

	@Override
	public boolean checkID(String ID) {
		// TODO Auto-generated method stub
		return false;
	}
  
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	 public boolean checkID(String Emp,String PID){
	    	////////////////////////////////////////////////////////////
	    	if(Emp.equals("Receptionist")){
	    		 ArrayList<Receptionist> arr=new ArrayList<Receptionist>();
	      		
	             try {
	                 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Receptionist.bin"));
	                arr=(ArrayList<Receptionist>) st.readObject();
	                st.close();
	             } catch (Exception ex) {
	              ex.getMessage();
	             } 
	     		int index=-1;
	             int i=0;
	             while(arr.size()>i){
	             if(arr.get(i).ID.equals(PID)){
	             index=i;
	             }
	             i++;
	             }
	             
	             if(index==-1){
	                 return false;
	                 }
	   
	             
	             return true;
	    		
	    	}
	    	///////////////////////////////////////////////////////////////
	    	else if(Emp.equals("Security")){
	    		 ArrayList<Security> arr1=new ArrayList<Security>();
	      		
	             try {
	                 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Security.bin"));
	                arr1=(ArrayList<Security>) st.readObject();
	                st.close();
	             } catch (Exception ex) {
	              ex.getMessage();
	             } 
	     		int index=-1;
	             int i=0;
	             while(arr1.size()>i){
	             if(arr1.get(i).ID.equals(PID)){
	             index=i;
	             }
	             i++;
	             }
	             
	             if(index==-1){
	                 return false;
	                 }
	            
	             
	             return true;
	    		
	    	}
	    	/////////////////////////////////////////////////////////////////////
	    	else if(Emp.equals("GeneralManager")){
	    		 ArrayList<GeneralManager> arr2=new ArrayList<GeneralManager>();
	     		
	             try {
	                 ObjectInputStream  st = new ObjectInputStream(new FileInputStream("GeneralManager.bin"));
	                arr2=(ArrayList<GeneralManager>) st.readObject();
	                st.close();
	             } catch (Exception ex) {
	              ex.getMessage();
	             } 
	     		int index=-1;
	             int i=0;
	             while(arr2.size()>i){
	             if(arr2.get(i).ID.equals(PID)){
	             index=i;
	             }
	             i++;
	             }
	             
	             if(index==-1){
	                 return false;
	                 }
	           
	             
	             return true;
	    		
	    	}
	    	///////////////////////////////////////////////////////////////////
	    	else if(Emp.equals("RoomCleaner")){
	           ArrayList<RoomCleaner> arr3=new ArrayList<RoomCleaner>();
	    		
	            try {
	                ObjectInputStream  st = new ObjectInputStream(new FileInputStream("RoomCleaner.bin"));
	               arr3=(ArrayList<RoomCleaner>) st.readObject();
	               st.close();
	            } catch (Exception ex) {
	             ex.getMessage();
	            } 
	    		int index=-1;
	            int i=0;
	            while(arr3.size()>i){
	            if(arr3.get(i).ID.equals(PID)){
	            index=i;
	            }
	            i++;
	            }
	            
	            if(index==-1){
	                return false;
	                }
	            
	            return true;
	    		
	    	}
	    	//////////////////////////////////////////////////////////////////
	    	else if(Emp.equals("Guest")){
	    		
	    		ArrayList<ArrayList<Object>> arr4=new ArrayList<ArrayList<Object>>();
	    		
	            try {
	                ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
	               arr4=(ArrayList<ArrayList<Object>>) st.readObject();
	               st.close();
	            } catch (Exception ex) {
	             ex.getMessage();
	            } 
	            
	    		int index=-1;
	            int i=0;
	            while(arr4.size()>i){
	            	  Guest q=(Guest)arr4.get(i).get(0);        
	                  if(q.ID.equals(PID)){
	                  index=i;
	                  }
	                  i++;
	                  }
	                  
	                  if(index==-1){
	                      return false;
	                  }
	            
	            return true;
	    	}
	    	////////////////////////////////////////////////////////////////////
	    	else if(Emp.equals("Transporter")){

	    		ArrayList<Transporter> arr5=new ArrayList<Transporter>();
	    		
	            try {
	                ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Transporter.bin"));
	               arr5=(ArrayList<Transporter>) st.readObject();
	               st.close();
	            } catch (Exception ex) {
	             ex.getMessage();
	            } 
	    		int index=-1;
	            int i=0;
	            while(arr5.size()>i){
	            if(arr5.get(i).ID.equals(PID)){
	            index=i;
	            }
	            i++;
	            }
	            
	            if(index==-1){
	                return false;
	                }
	            
	            return true;
	    		
	    	}
	    	
	    	return false;
	     }

    
    
}
