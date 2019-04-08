package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReceptionistADD_MOD_DEL {
	int X;
	int Y;
   JButton jbtn1;
   JButton jbtn2;
   JButton jbtn3;
   JLabel jlblpgn;
   JFrame y;
   
   public ReceptionistADD_MOD_DEL(int X, int Y){ 
	   this.X=X;
	   this.Y=Y;
	   jbtn1=new JButton("Add Receptionist");
	   jbtn2=new JButton("Delete Receptionist");
	   jbtn3=new JButton("Modify Receptionist");
	   jlblpgn=new JLabel();
	   y=new JFrame();
	   
       y.setLayout(null);
       y.getContentPane().setBackground(Color.CYAN);
       y.setTitle("Receptionist");
       y.setResizable(Boolean.FALSE);
       y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
       y.setSize(X, Y);
       //jlblpgn.setIcon(new ImageIcon (new ImageIcon("angrybirdsmovie.jpg").getImage().getScaledInstance(X, Y, Image.SCALE_DEFAULT)));
       
       y.add(jbtn1);    
       y.add(jbtn2);
       y.add(jbtn3);
       //y.add(jlblpgn);
       jbtn1.setBounds((X/2)-75,30,190,40);
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
			
			}
			if(Jbtn.equals(jbtn2)){
		
				
			}
			if(Jbtn.equals(jbtn3)){
				
			}
			
		}
	
  } 
}
