package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GeneralMangerMenu {
	   int X,Y;
	   JButton jbtn1;
	   JButton jbtn2;
	   JButton jbtn3;
	   JButton jbtn4;
	   JButton jbtn5;
	   JButton jbtn6;
	  // JLabel jlblpgn;
	   JFrame y;
	   
	   public GeneralMangerMenu(int X, int Y){ 
		   this.X=X;
		   this.Y=Y;
		   jbtn1=new JButton("Modify Guest Records");
		   jbtn2=new JButton("Modify Receptionist Records");
		   jbtn3=new JButton("Modify General Manager Records");
		   jbtn4=new JButton("Modify Security Records");
		   jbtn5=new JButton("Modify RoomCleaner Records");
		   jbtn6=new JButton("Modify Transporter Records");
		   //jlblpgn=new JLabel();
		   y=new JFrame();
		   
	       y.setLayout(null);
	       y.getContentPane().setBackground(Color.CYAN);
	       y.setTitle("General Manager Menu");
	       y.setResizable(Boolean.FALSE);
	       y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
	       y.setSize(X, Y);
	       //jlblpgn.setIcon(new ImageIcon (new ImageIcon("angrybirdsmovie.jpg").getImage().getScaledInstance(X, Y, Image.SCALE_DEFAULT)));
	       
	       y.add(jbtn1);    
	       y.add(jbtn2);
	       y.add(jbtn3);
	       y.add(jbtn4);
	       y.add(jbtn5);
	       y.add(jbtn6);
	       //y.add(jlblpgn);
	       jbtn1.setBounds((X/2)-115,30,230,40);
	       jbtn2.setBounds(jbtn1.getX(),jbtn1.getY()+50,jbtn1.getWidth(),40);
	       jbtn3.setBounds(jbtn1.getX(),jbtn2.getY()+50,jbtn1.getWidth(),40);
	       jbtn4.setBounds(jbtn1.getX(),jbtn3.getY()+50,jbtn1.getWidth(),40);
	       jbtn5.setBounds(jbtn1.getX(),jbtn4.getY()+50,jbtn1.getWidth(),40);
	       jbtn6.setBounds(jbtn1.getX(),jbtn5.getY()+50,jbtn1.getWidth(),40);
	       
	       
	       
	       jbtn1.addActionListener(new handler());
	       jbtn2.addActionListener(new handler());
	       jbtn3.addActionListener(new handler());
	       jbtn4.addActionListener(new handler());
	       jbtn5.addActionListener(new handler());
	       jbtn6.addActionListener(new handler());
	   }
	   
	   private class handler implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Object Jbtn=e.getSource();
				if(Jbtn.equals(jbtn1)){
					y.setVisible(false);
					Guest_ADD_MOD_DEL s=new Guest_ADD_MOD_DEL(X, Y);
					s.y.setVisible(true);
				}
				if(Jbtn.equals(jbtn2)){
					y.setVisible(false);
					ReceptionistADD_MOD_DEL r=new ReceptionistADD_MOD_DEL(X, Y);
					r.y.setVisible(true);
				}
				if(Jbtn.equals(jbtn3)){
					y.setVisible(false);
					GeneralManager_ADD_MOD_DEL r=new GeneralManager_ADD_MOD_DEL(X, Y);
					r.y.setVisible(true);
				}
				if(Jbtn.equals(jbtn4)){
					y.setVisible(false);
					Security_ADD_MOD_DEL r=new Security_ADD_MOD_DEL(X, Y);
					r.y.setVisible(true);
				}
				if(Jbtn.equals(jbtn5)){
					y.setVisible(false);
					RoomCleaner_ADD_MOD_DEL r=new RoomCleaner_ADD_MOD_DEL(X, Y);
					r.y.setVisible(true);
				}
				if(Jbtn.equals(jbtn6)){
					y.setVisible(false);
					Transporter_ADD_MOD_DEL r=new Transporter_ADD_MOD_DEL(X, Y);
					r.y.setVisible(true);
				}
				
			}
		
	  } 
	
}
