/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import humans.Receptionist;


/**
 *
 * @author John
 */
public class Guest_ADD_MOD_DEL {
	int X;
	int Y;
   JButton jbtn1;
   JButton jbtn2;
   JButton jbtn3;
   JLabel jlblpgn;
   JFrame y;
   
   public Guest_ADD_MOD_DEL(int X, int Y){ 
	   this.X=X;
	   this.Y=Y;
	   jbtn1=new JButton("Add Guest");
	   jbtn2=new JButton("Delete Guest");
	   jbtn3=new JButton("Modify Guest");
	   jlblpgn=new JLabel();
	   y=new JFrame();
	   
       y.setLayout(null);
       y.getContentPane().setBackground(Color.CYAN);
       y.setTitle("Guest");
       y.setResizable(Boolean.FALSE);
       y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
       y.setSize(X, Y);
       //jlblpgn.setIcon(new ImageIcon (new ImageIcon("angrybirdsmovie.jpg").getImage().getScaledInstance(X, Y, Image.SCALE_DEFAULT)));
       
       y.add(jbtn1);    
       y.add(jbtn2);
       y.add(jbtn3);
       //y.add(jlblpgn);
       jbtn1.setBounds((X/2)-75,30,150,40);
       jbtn2.setBounds(jbtn1.getX(),jbtn1.getY()+50,jbtn1.getWidth(),40);
       jbtn3.setBounds(jbtn1.getX(),jbtn2.getY()+50,jbtn1.getWidth(),40);
       
       jbtn1.addActionListener(new handler());
       jbtn2.addActionListener(new handler());
       jbtn3.addActionListener(new handler());
   }
   
   private class handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object Jbtn=e.getSource();
			if(Jbtn.equals(jbtn1)){
				y.setVisible(false);
				GuestAdd s=new GuestAdd(X, Y);
				s.w.setVisible(true);
			}
			if(Jbtn.equals(jbtn2)){
		
				String st=JOptionPane.showInputDialog(null, "Enter the ID of the Guest:");
				Receptionist rx=new Receptionist();
				
				if(rx.checkID(st)==true){
					rx.Delete(st);
					JOptionPane.showMessageDialog(null, "Guest Record deleted!!");
				}
				else{
					
					JOptionPane.showMessageDialog(null, "Guest not found!!");
				}
				
			}
			if(Jbtn.equals(jbtn3)){
				String st=JOptionPane.showInputDialog(null, "Enter the ID of the Guest:");
				Receptionist rx=new Receptionist();
				
				if(rx.checkID(st)==true){
					y.setVisible(false);
					GuestModify GM=new GuestModify(X, Y);
					GM.w.setVisible(true);
				}
				else{
					
					JOptionPane.showMessageDialog(null, "Guest not found!!");
				}
				
				
			}
			
		}
	
  } 
}
