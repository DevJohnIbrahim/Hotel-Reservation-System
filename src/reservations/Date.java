/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.io.Serializable;

/**
 *
 * @author CSC
 */
public class Date  implements Serializable {
    
   public int day;
   public int month;
   public int year;
   
   public Date(){
   day=0;
   month=0;
   year=0;
   }
   public Date(int day,int month,int year){
   this.day=day;
   this.month=month;
   this.year=year;
   }
}
