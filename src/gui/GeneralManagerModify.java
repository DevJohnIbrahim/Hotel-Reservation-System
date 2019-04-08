package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import humans.GeneralManager;


public class GeneralManagerModify {

	    JLabel jlbl1;
	    JLabel jlbl2;
	    JLabel jlbl3;
	    JLabel jlbl4;
	    JLabel jlbl5;
	    JLabel jlbl6;
	    JLabel jlbl7;
	    JLabel jlbl8;
	    JTextField jtxtf1;
	    JTextField jtxtf2;
	    JTextField jtxtf3;
	    JTextField jtxtf4;
	    JTextField jtxtf5;
	    JTextField jtxtf7;
	    JTextField jtxtf8;
	    JComboBox<String> jcbx1;
	    JButton jbtn1;
	    JFrame w=new JFrame();
	    
	    public GeneralManagerModify(int X,int Y,String ID){
	    	jlbl1=new JLabel("First Name");
	    	jlbl2=new JLabel("Last Name");
	 	    jlbl3=new JLabel("Age");
	 	    jlbl4=new JLabel("ID");
	 	    jlbl5=new JLabel("Office Number");
	 	    jlbl6=new JLabel("Gender");
	 	    jlbl7=new JLabel("Admin Username");
	 	    jlbl8=new JLabel("Admin Password");
	 	    jtxtf1=new JTextField("Enter Frist name");
		    jtxtf2=new JTextField("Enter Last name");
		    jtxtf3=new JTextField("Enter Age");
		    jtxtf4=new JTextField(ID);
		    jtxtf4.setEditable(false);
		    jtxtf5=new JTextField("Enter Office Number");
		    jtxtf7=new JTextField("Enter Username");
		    jtxtf8=new JTextField("Enter Password");
		    jbtn1=new JButton("Save");
	    	jcbx1=new JComboBox<>(new String[]{"Male","Female"});
	    	
	        w.setLayout(null);
	        w.getContentPane().setBackground(Color.CYAN);  
	        w.setSize(X,Y);
	        w.setTitle("GeneralManager Add");
	        w.setResizable(Boolean.FALSE);
	        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        w.add(jlbl1);
	        w.add(jlbl2);
	        w.add(jlbl3);
	        w.add(jlbl4);
	        w.add(jlbl5);
	        w.add(jlbl6);
	        w.add(jlbl7);
	        w.add(jlbl8);
	        w.add(jtxtf1);
	        w.add(jtxtf2);
	        w.add(jtxtf3);
	        w.add(jtxtf4);
	        w.add(jtxtf5);
	        w.add(jtxtf7);
	        w.add(jtxtf8);
	        w.add(jcbx1);
	        w.add(jbtn1);
	        
	        
	        jlbl1.setBounds((X/2)-100,10,70,20);
	        jlbl2.setBounds(jlbl1.getX(),jlbl1.getY()+40, 100, 20);
	        jlbl3.setBounds(jlbl1.getX(),jlbl2.getY()+40, 100, 20);
	        jlbl4.setBounds(jlbl1.getX(),jlbl3.getY()+40, 100, 20);
	        jlbl5.setBounds(jlbl1.getX(),jlbl4.getY()+40, 100, 20);
	        jlbl6.setBounds(jlbl1.getX(),jlbl5.getY()+40, 100, 20);
	        jlbl7.setBounds(jlbl1.getX(),jlbl6.getY()+40, 100, 20);
	        jlbl8.setBounds(jlbl1.getX(),jlbl7.getY()+40, 100, 20);
	        jtxtf1.setBounds(jlbl1.getX()+110,jlbl1.getY(), 120, 20);
	        jtxtf2.setBounds(jlbl1.getX()+110,jlbl2.getY(), 120, 20);
	        jtxtf3.setBounds(jlbl1.getX()+110,jlbl3.getY(), 120, 20);
	        jtxtf4.setBounds(jlbl1.getX()+110,jlbl4.getY(), 120, 20);
	        jtxtf5.setBounds(jlbl1.getX()+110,jlbl5.getY(), 120, 20);
	        jtxtf7.setBounds(jlbl1.getX()+110,jlbl7.getY(), 120, 20);
	        jcbx1.setBounds(jlbl1.getX()+110,jlbl6.getY(), 120, 20);
	        jtxtf8.setBounds(jlbl1.getX()+110,jlbl8.getY(), 120, 20);
	        jbtn1.setBounds(jlbl1.getX(),jlbl8.getY()+40, 80, 30);
	        
	        
	        
	        jbtn1.addActionListener(new holder());
	        jtxtf1.addFocusListener(new holder());
	        jtxtf2.addFocusListener(new holder());
	        jtxtf3.addFocusListener(new holder());
	        jtxtf5.addFocusListener(new holder());
	        jtxtf7.addFocusListener(new holder());
	        jtxtf8.addFocusListener(new holder());
	      
	    }
	      private class holder implements ActionListener,FocusListener{

	            @Override
	            public void actionPerformed(ActionEvent e) {
	             
	             Object f1=e.getSource();
	             GeneralManager gu =new GeneralManager();
	             
	             if(f1.equals(jbtn1)){
	               gu.FirstName=jtxtf1.getText();
	               gu.LastName=jtxtf2.getText();
	               gu.Age=Integer.parseInt(jtxtf3.getText());
	               gu.ID =jtxtf4.getText();
	               gu.OfficeNumber=Integer.parseInt(jtxtf5.getText());
	               gu.Gender=(String) jcbx1.getSelectedItem();
	               gu.AdminID=jtxtf7.getText();
	               gu.AdminPassword=jtxtf8.getText();
	               GeneralManager r=new GeneralManager();
	               r.Update(gu);
	               
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
	                 if(zc.equals(jtxtf5)){
	                jtxtf5.setText("");
	                
	                } 
	                 if(zc.equals(jtxtf7)){
	                jtxtf7.setText("");
	                
	                } 
	                 if(zc.equals(jtxtf8)){
	                jtxtf8.setText("");
	                
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
	           
	                if(zc.equals(jtxtf5)&&jtxtf5.getText().equals("")){
	                jtxtf5.setText("Office Number");
	                
	                }     
	              
	                if(zc.equals(jtxtf7)&&jtxtf7.getText().equals("")){
	                jtxtf7.setText("Enter UserName");
	                
	                }
	                if(zc.equals(jtxtf8)&&jtxtf8.getText().equals("")){
	                jtxtf8.setText("Enter Password");
	                
	                }
	             
	        
	                 }
	        
	        
	        } 

}
