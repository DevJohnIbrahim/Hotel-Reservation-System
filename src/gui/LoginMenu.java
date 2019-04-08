/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

//import java.awt.Button;
import java.awt.Color;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import humans.GeneralManager;
import humans.Receptionist;

/**
 *
 * @author John
 */
public class LoginMenu {
	int X;
	int Y;
   JButton jbtn1;
   JButton jbtn2;
   JLabel jlbl1;
   JLabel jlbl2;
   JLabel jlblpgn;
   JTextField jtxtf1;
   JTextField jtxtf2;
   public JFrame x;
   
   public LoginMenu(int X, int Y){ 
	   this.X=X;
	   this.Y=Y;
	   jbtn1=new JButton("Login");
	   jbtn2=new JButton("Login as a guest");
	   jlbl1=new JLabel("Username");
	   jlbl2=new JLabel("Password");
	   //jlblpgn=new JLabel();
	   jtxtf1= new JTextField("drayman");
	   jtxtf2= new JTextField("test");
	   x=new JFrame();
	   
       x.setLayout(null);
       x.getContentPane().setBackground(Color.CYAN);
       x.setTitle("Hotel Reservation");
       x.setResizable(Boolean.FALSE);
       x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
       x.setSize(X, Y);
      // jlblpgn.setIcon(new ImageIcon (new ImageIcon("angrybirdsmovie.jpg").getImage().getScaledInstance(X, Y, Image.SCALE_DEFAULT)));
      
       x.add(jbtn1);    
       x.add(jbtn2);
       x.add(jlbl1);
       x.add(jlbl2);
       x.add(jtxtf1);
       x.add(jtxtf2);
       //x.add(jlblpgn);
       jlbl1.setBounds((X/2)-80,30,60,20);
       jlbl2.setBounds(jlbl1.getX(),jlbl1.getY()+30,jlbl1.getWidth(),20);
       jtxtf1.setBounds(jlbl1.getX()+70,jlbl1.getY(),90,20);
       jtxtf2.setBounds(jtxtf1.getX(),jlbl2.getY(),jtxtf1.getWidth(),jtxtf1.getHeight());
       jbtn1.setBounds(jlbl1.getX(),jlbl1.getY()+60,65,30);
       jbtn2.setBounds(jlbl1.getX(),jlbl1.getY()+120,140,30);
      
       jbtn1.addActionListener(new handler());
       jbtn2.addActionListener(new handler());
       jtxtf1.addFocusListener(new handler());
       jtxtf2.addFocusListener(new handler());
       
      
   }
   
   private class handler implements ActionListener,FocusListener{

		@Override
		public void actionPerformed(ActionEvent e) {
             Object Jbtn=e.getSource();
			if(Jbtn.equals(jbtn1)){
				if(!jtxtf1.getText().equals("")&&!jtxtf2.getText().equals("")){
				Receptionist recep=new Receptionist();
				GeneralManager general=new GeneralManager();
				if(recep.Login(jtxtf1.getText(),jtxtf2.getText())){
					x.setVisible(false);
					Guest_ADD_MOD_DEL q=new Guest_ADD_MOD_DEL(X, Y);
					q.y.setVisible(true);
				}
				else if(general.Login(jtxtf1.getText(),jtxtf2.getText())){
					x.setVisible(false);
					GeneralMangerMenu g=new GeneralMangerMenu(X, Y);
					g.y.setVisible(true);
				}
				else{	
					JOptionPane.showMessageDialog(null, "Wrong Username or password!!");
				}
				
				
				}
				
			}
			if(Jbtn.equals(jbtn2)){
			x.setVisible(false);
			GuestAdd s=new GuestAdd(X, Y);
			s.w.setVisible(true);
			}
			
		}
		
		public void focusGained(FocusEvent e) {
			Object Jtxt=e.getSource();
			if(Jtxt.equals(jtxtf1)&&jtxtf1.getText().equals("username")){
				jtxtf1.setText("");
			}
			if(Jtxt.equals(jtxtf2)&&jtxtf2.getText().equals("password")){
				jtxtf2.setText("");
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			Object Jtxt=e.getSource();
			if(Jtxt.equals(jtxtf1)&&jtxtf1.getText().equals("")){
				jtxtf1.setText("username");
			}
			if(Jtxt.equals(jtxtf2)&&jtxtf2.getText().equals("")){
				jtxtf2.setText("password");
			}
      }
  
   
   } 
    
}
