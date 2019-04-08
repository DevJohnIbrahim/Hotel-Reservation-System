package humans;
import java.io.*;
import java.util.ArrayList;


import Encrypt_Decrypt.Enc_Dec;
import interfaces.ILogin;
import interfaces.IModify;
import rooms.*;
import reservations.*;
public class Receptionist extends Employee implements ILogin,IModify{
	public String LogID;
    public String LogPassword;
	
	public Receptionist(){
		super();
		LogID="";
	    LogPassword="";
	    Enc_Dec.SetHashMap();
	}
	
    
//////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean Login(String user,String Password) {
     
    	  try {
    		  Enc_Dec.SetHashMap();
    		  String decrypted=new String();
    		  ArrayList<Receptionist> x=new ArrayList<Receptionist>();
    		  int i=0;
              ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Receptionist.bin"));
              x=(ArrayList<Receptionist>) st.readObject();
              st.close();
              
              while(x.size()>=i){
            	  decrypted=""+Enc_Dec.decryption(x.get(i).LogPassword);
            	  if(x.get(i).LogID.equals(user)&&decrypted.equals(Password)){
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
    @Override
	public void Add() {
		
	}
    
    public void Add(Guest g,Room r,AdditionalServices as,Payment p) {
    	
    	ArrayList<ArrayList<Object>> arr=new ArrayList<>();
        try {
            ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
           arr=(ArrayList<ArrayList<Object>>) st.readObject();
           st.close();
        } catch (Exception ex) {
         ex.getMessage();
        } 
     
        	ArrayList<Object> x=new ArrayList<>(); 
        	x.add(g);
        	x.add(r);
        	x.add(as);
        	x.add(p);
    	  arr.add(x);
          try{
          ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Guest.bin"));
          st.writeObject(arr);
          st.close();
          }
          catch(Exception e){
              e.getMessage();
            
          }
    }
    //////////////////////////////////////////////////////////////////////////////////////
    @Override
	public int Update() {
		return 0;
	}

    public int Update(Guest g,Room r,AdditionalServices as,Payment p) {
    	ArrayList<ArrayList<Object>> arr=new ArrayList<>();
        try {
            ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
           arr=(ArrayList<ArrayList<Object>>) st.readObject();
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
        while(arr.size()>i){
        	
         Guest q=(Guest)arr.get(i).get(0);
         
         if(q.ID.equals(g.ID)){
         arr.remove(i);
 	     arr.add(x);
         index=i;
         }
         i++;
         }
         
         if(index==-1){
             return 0;
             }
         else{
          try{
        ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Guest.bin"));
        st.writeObject(arr);
        st.close();
        }
        catch(Exception e){
            e.getMessage();
            return 0;
            }
         }
          
          return 1;
    }

    
    /////////////////////////////////////////////////////////////////////////////////////////////
    @Override
	public int Delete() {
		return 0;
	}
    
    
    public int Delete(String Tid) {
    
    	ArrayList<ArrayList<Object>> arr=new ArrayList<>();
        try {
            ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
           arr=(ArrayList<ArrayList<Object>>) st.readObject();
           st.close();
        } catch (Exception ex) {
         ex.getMessage();
        } 
     
    	int index=-1;
        int i=0;
        while(arr.size()>i){
         Guest q=(Guest)arr.get(i).get(0);
            
        if(q.ID.equals(Tid)){
        arr.remove(i);
        index=i;
        }
        i++;
        }
        
        if(index==-1){
            return 0;
            }
        
       try{
       ObjectOutputStream st=new ObjectOutputStream(new FileOutputStream("Guest.bin"));
       st.writeObject(arr);
       st.close();
       }
       catch(Exception e){
           e.getMessage();
           return 0;
       }
        
        return 1;
    }


	@Override
	public boolean checkID(String ID) {

    	ArrayList<ArrayList<Object>> arr=new ArrayList<>();
        try {
            ObjectInputStream  st = new ObjectInputStream(new FileInputStream("Guest.bin"));
           arr=(ArrayList<ArrayList<Object>>) st.readObject();
           st.close();
        } catch (Exception ex) {
         ex.getMessage();
        }

    	int index=-1;
        int i=0;
        while(arr.size()>i){
         Guest q=(Guest)arr.get(i).get(0);
            
        if(q.ID.equals(ID)){
        index=i;
        }
        i++;
        }
        
        if(index==-1){
        	return false;
        }
        
	
		return true;
	}


	
}
