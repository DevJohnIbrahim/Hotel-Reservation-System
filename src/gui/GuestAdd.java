/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

//import humans.Employee;
import humans.Guest;
import humans.Receptionist;
import java.awt.Color;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import reservations.AdditionalServices;
//import reservations.Date;
import reservations.Payment;
//import rooms.Bed;
import rooms.Room;

/**
 *
 * @author John
 */
public class GuestAdd  {
    JLabel jlbl1=new JLabel("First Name");
    JLabel jlbl2=new JLabel("Last Name");
    JLabel jlbl3=new JLabel("Age");
    JLabel jlbl4=new JLabel("Check in date");
    JLabel jlbl5=new JLabel("Check out date");
    JLabel jlbl6=new JLabel("Deposit left");
    JLabel jlbl7=new JLabel("ID");
    JLabel jlbl8=new JLabel("Gender");
    JLabel jlbl9=new JLabel("Room Number");
    JLabel jlbl10=new JLabel("Floor Number");
    JLabel jlbl11=new JLabel("Bed Length");
    JLabel jlbl15=new JLabel("Bed Width");
    JLabel jlbl12=new JLabel("Room Type");
    JLabel jlbl13=new JLabel("Additional services");
    JLabel jlbl14=new JLabel("Payment");
    JTextField jtxtf1=new JTextField("Enter Frist name");
    JTextField jtxtf2=new JTextField("Enter Last name");
    JTextField jtxtf3=new JTextField("Enter Age");
    JTextField jtxtf4=new JTextField("Day");
    JTextField jtxtf13=new JTextField("Mon");
    JTextField jtxtf14=new JTextField("Year");
    JTextField jtxtf5=new JTextField("Day");  
    JTextField jtxtf15=new JTextField("Mon");
    JTextField jtxtf16=new JTextField("Year");
    JTextField jtxtf6=new JTextField("Enter Deposit Left");
    JTextField jtxtf7=new JTextField("Enter ID");
    JTextField jtxtf8=new JTextField("Enter Room Number");
    JTextField jtxtf9=new JTextField("Enter Floor Number");
    JTextField jtxtf10=new JTextField("Enter Bed Length");
    JTextField jtxtf11=new JTextField("Enter Bed Width");
    JTextField jtxtf12=new JTextField("Enter in $");
    JComboBox jcbx1=new JComboBox(new String[]{"Male","Female"});
    JComboBox jcbx2 =new JComboBox(new String[]{"Single room","Double room","Triple room"});
    JButton jbtn1=new JButton("Save");
    JCheckBox jchb1=new JCheckBox(" Jetski");
    JCheckBox jchb2=new JCheckBox("Tennis table");
    JCheckBox jchb3=new JCheckBox(" Spa");
    JCheckBox jchb4=new JCheckBox("Snorkling");
    JCheckBox jchb5=new JCheckBox("Car");
    
    JLabel jlblpgn=new JLabel();
    JFrame w=new JFrame();
       
       
    public GuestAdd(int X,int Y){
     w.setLayout(null);
     w.getContentPane().setBackground(Color.CYAN);  
     w.setSize(X,Y);
     w.setTitle("Guest Add");
     w.setResizable(Boolean.FALSE);
     w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //  jlblpgn.setIcon(new ImageIcon (new ImageIcon("angrybirdsmovie.jpg").getImage().getScaledInstance(X, Y, Image.SCALE_DEFAULT)));
     
     w.add(jlbl1);
     w.add(jlbl2);
     w.add(jlbl3);
     w.add(jlbl4);
     w.add(jlbl5);
     w.add(jlbl6);
     w.add(jlbl7);
     w.add(jlbl8);
     w.add(jlbl9);
     w.add(jlbl10);
     w.add(jlbl11);
     w.add(jlbl12);
     w.add(jlbl13);
     w.add(jlbl14);
     w.add(jlbl15);
     w.add(jtxtf1);
     w.add(jtxtf2);
     w.add(jtxtf3);
     w.add(jtxtf4);
     w.add(jtxtf5);
     w.add(jtxtf6);
     w.add(jtxtf7);
     w.add(jtxtf8);
     w.add(jtxtf9);
     w.add(jtxtf10);
     w.add(jtxtf11);
     w.add(jtxtf12);
     w.add(jtxtf13);
     w.add(jtxtf14);
     w.add(jtxtf15);
     w.add(jtxtf16);
     w.add(jcbx1);
     w.add(jcbx2);
     w.add(jchb1);
     w.add(jchb2);
     w.add(jbtn1);
     w.add(jchb3);
     w.add(jchb4);
     w.add(jchb5);
//     w.add(jlblpgn);

     
     jlbl1.setBounds((X/2)-100,10,70,20);
     jlbl2.setBounds(jlbl1.getX(),jlbl1.getY()+40, 70, 20);
     jlbl3.setBounds(jlbl1.getX(),jlbl2.getY()+40, 70, 20);
     jlbl4.setBounds(jlbl1.getX(),jlbl3.getY()+40, 85, 20);
     jlbl5.setBounds(jlbl1.getX(),jlbl4.getY()+40, 85, 20);
     jlbl6.setBounds(jlbl1.getX(),jlbl5.getY()+40, 70, 20);
     jlbl7.setBounds(jlbl1.getX(),jlbl6.getY()+40, 70, 20);
     jlbl8.setBounds(jlbl1.getX(),jlbl7.getY()+40, 70, 20);
     jlbl9.setBounds(jlbl1.getX(),jlbl8.getY()+40, 85, 20);
     jlbl10.setBounds(jlbl1.getX(),jlbl9.getY()+40, 80, 20);
     jlbl11.setBounds(jlbl1.getX(),jlbl10.getY()+40, 70, 20);
     jlbl15.setBounds(jlbl1.getX(),jlbl11.getY()+40, 70, 20);;
     jlbl12.setBounds(jlbl1.getX(),jlbl15.getY()+40, 70, 20);
     jlbl13.setBounds(jlbl1.getX(),jlbl12.getY()+40, 110, 20);
     jtxtf1.setBounds(jlbl1.getX()+95,jlbl1.getY(), 120, 20);
     jtxtf2.setBounds(jlbl1.getX()+95,jlbl2.getY(), 120, 20);
     jtxtf3.setBounds(jlbl1.getX()+95,jlbl3.getY(), 120, 20);
     jtxtf4.setBounds(jlbl1.getX()+95,jlbl4.getY(), 30, 20);
     jtxtf13.setBounds(jtxtf4.getX()+35,jlbl4.getY(), 30, 20);
     jtxtf14.setBounds(jtxtf13.getX()+35,jlbl4.getY(), 30, 20);
     jtxtf5.setBounds(jlbl1.getX()+95,jlbl5.getY(), 30, 20);
     jtxtf15.setBounds(jtxtf5.getX()+35,jlbl5.getY(), 30, 20);
     jtxtf16.setBounds(jtxtf15.getX()+35,jlbl5.getY(), 30, 20);
     jtxtf6.setBounds(jlbl1.getX()+95,jlbl6.getY(), 120, 20);
     jtxtf7.setBounds(jlbl1.getX()+95,jlbl7.getY(), 120, 20);
     jcbx1.setBounds(jlbl1.getX()+95,jlbl8.getY(), 120, 20);
     jtxtf8.setBounds(jlbl1.getX()+95,jcbx1.getY()+40, 120, 20);
     jtxtf9.setBounds(jlbl1.getX()+95,jtxtf8.getY()+40, 120, 20);
     jtxtf10.setBounds(jlbl1.getX()+95,jtxtf9.getY()+40, 120, 20);
     jtxtf11.setBounds(jlbl1.getX()+95,jtxtf10.getY()+40, 120, 20);
     jcbx2.setBounds(jlbl1.getX()+95,jtxtf11.getY()+40, 120, 20);
     jchb1.setBounds(jlbl1.getX(),jcbx2.getY()+80, 80, 20);
     jchb2.setBounds(jlbl1.getX()+80,jcbx2.getY()+80, 100, 20);
     jchb3.setBounds(jlbl1.getX()+180,jcbx2.getY()+80, 70, 20);
     jchb4.setBounds(jlbl1.getX(),jchb3.getY()+40, 80, 20);
     jchb5.setBounds(jlbl1.getX()+95,jchb3.getY()+40, 70, 20);
     jlbl14.setBounds(jlbl1.getX(),jchb4.getY()+40, 70, 20);
     jtxtf12.setBounds(jlbl1.getX()+95,jchb4.getY()+40, 70, 20);
     jbtn1.setBounds(jlbl1.getX(),jlbl14.getY()+40, 70, 30);
     
     jbtn1.addActionListener(new holder());
     jtxtf1.addFocusListener(new holder());
     jtxtf2.addFocusListener(new holder());
     jtxtf3.addFocusListener(new holder());
     jtxtf4.addFocusListener(new holder());
     jtxtf5.addFocusListener(new holder());
     jtxtf6.addFocusListener(new holder());
     jtxtf7.addFocusListener(new holder());
     jtxtf8.addFocusListener(new holder());
     jtxtf9.addFocusListener(new holder());
     jtxtf10.addFocusListener(new holder());
     jtxtf11.addFocusListener(new holder());
     jtxtf13.addFocusListener(new holder());
     jtxtf14.addFocusListener(new holder());
     jtxtf15.addFocusListener(new holder());
     jtxtf16.addFocusListener(new holder());
    } 
    
    private class holder implements ActionListener,FocusListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object f1=e.getSource();
             Guest gu =new Guest();
             Room rm=new Room();
             Payment pa=new Payment();
             AdditionalServices ad=new AdditionalServices();
         if(f1.equals(jbtn1)){
         gu.FirstName=jtxtf1.getText();
         gu.LastName=jtxtf2.getText();
         gu.Age=Integer.parseInt(jtxtf3.getText());
         gu.CheckInDate.day   =Integer.parseInt(jtxtf4.getText());
         gu.CheckInDate.year=Integer.parseInt(jtxtf14.getText());
         gu.CheckInDate.month=Integer.parseInt(jtxtf13.getText());
         gu.CheckOutDate.day=Integer.parseInt(jtxtf5.getText());
         gu.CheckOutDate.month=Integer.parseInt(jtxtf15.getText());
         gu.CheckOutDate.year=Integer.parseInt(jtxtf16.getText());
         gu.Gender=(String) jcbx1.getSelectedItem();
         gu.ID=jtxtf7.getText();
         gu.DepositLeft=Integer.parseInt(jtxtf6.getText());
         rm.RoomNumber=Integer.parseInt(jtxtf8.getText());
         rm.FloorNumber=Integer.parseInt(jtxtf9.getText());
         rm.BED.lenght=Integer.parseInt(jtxtf10.getText());
         rm.BED.width=Integer.parseInt(jtxtf11.getText());
         rm.RoomType=(Room.RoomType_) jcbx2.getSelectedItem();
         ad.JetSki=jchb1.isSelected();
         ad.TennisTable=jchb2.isSelected();
         ad.snorkling=jchb4.isSelected();
         ad.spa=jchb5.isSelected();
         pa.amount=Float.parseFloat(jtxtf12.getText());
        Receptionist r=new  Receptionist();
        r.Add(gu, rm, ad, pa);
           
         }
     }

        @Override
        public void focusGained(FocusEvent e) {
            Object zc=e.getSource();
            if(zc.equals(jtxtf1)){
            jtxtf1.setText("");
            
            }
             if(zc.equals(jtxtf2)){
            jtxtf2.setText("");
            
            }
              if(zc.equals(jtxtf3)){
            jtxtf3.setText("");
            
            }
               if(zc.equals(jtxtf4)){
            jtxtf4.setText("");
            
            }if(zc.equals(jtxtf13)){
            jtxtf13.setText("");
            
            }if(zc.equals(jtxtf14)){
            jtxtf14.setText("");
            
            }
                if(zc.equals(jtxtf5)){
            jtxtf5.setText("");
            
            }  if(zc.equals(jtxtf15)){
            jtxtf15.setText("");
            
            }   if(zc.equals(jtxtf16)){
            jtxtf16.setText("");
            
            }if(zc.equals(jtxtf6)){
            jtxtf6.setText("");
            
            } if(zc.equals(jtxtf7)){
            jtxtf7.setText("");
            
            } if(zc.equals(jtxtf8)){
            jtxtf8.setText("");
            
            }
             if(zc.equals(jtxtf9)){
            jtxtf9.setText("");
            
            }
              if(zc.equals(jtxtf10)){
            jtxtf10.setText("");
            
            }
               if(zc.equals(jtxtf11)){
            jtxtf11.setText("");
            
            }
                if(zc.equals(jtxtf1)){
            jtxtf1.setText("");
            
            }
                 if(zc.equals(jtxtf1)){
            jtxtf1.setText("");
            
            }
            
            
                
        }

        @Override
        public void focusLost(FocusEvent e) {
            Object zc=e.getSource();
            if(zc.equals(jtxtf1)&&jtxtf1.getText().equals("")){
            jtxtf1.setText("Enter FirstName");
            
            }
            if(zc.equals(jtxtf2)&&jtxtf2.getText().equals("")){
            jtxtf2.setText("Enter LastName");
            
            }
            if(zc.equals(jtxtf3)&&jtxtf3.getText().equals("")){
            jtxtf3.setText("Enter Age");
            
            }
            if(zc.equals(jtxtf4)&&jtxtf4.getText().equals("")){
            jtxtf4.setText("Day");
            
            }if(zc.equals(jtxtf13)&&jtxtf13.getText().equals("")){
            jtxtf13.setText("Mon");
            
            }if(zc.equals(jtxtf14)&&jtxtf14.getText().equals("")){
            jtxtf14.setText("Year");
            
            }
            if(zc.equals(jtxtf5)&&jtxtf5.getText().equals("")){
            jtxtf5.setText("day");
            
            }
            if(zc.equals(jtxtf15)&&jtxtf15.getText().equals("")){
            jtxtf15.setText("month");
            
            }if(zc.equals(jtxtf16)&&jtxtf16.getText().equals("")){
            jtxtf16.setText("year");
            
            }
            if(zc.equals(jtxtf6)&&jtxtf6.getText().equals("")){
            jtxtf6.setText("Enter deposit date");
            
            }
            if(zc.equals(jtxtf7)&&jtxtf7.getText().equals("")){
            jtxtf7.setText("Enter id");
            
            }
            if(zc.equals(jtxtf8)&&jtxtf8.getText().equals("")){
            jtxtf8.setText("Enter room number");
            
            }
            if(zc.equals(jtxtf9)&&jtxtf9.getText().equals("")){
            jtxtf9.setText("Enter Floor number");
            
            }
            if(zc.equals(jtxtf10)&&jtxtf10.getText().equals("")){
            jtxtf10.setText("Enter bed type ");
            
            }
            if(zc.equals(jtxtf11)&&jtxtf11.getText().equals("")){
            jtxtf11.setText("Enter $");
            
            }
           
            
             }
    
    
    } 
}
