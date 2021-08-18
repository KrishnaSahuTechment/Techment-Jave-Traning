package com.techment.test18august.program4;



import javax.swing.*;    
import java.awt.event.*;    
class RadioButtonExample extends JFrame implements ActionListener{
		
	JRadioButton rb1,rb2,rb3;    
	JButton b;    
	RadioButtonExample()
	{      
		rb1=new JRadioButton("Green");    
		rb1.setBounds(100,50,100,30);      
		
		rb2=new JRadioButton("Red");    
		rb2.setBounds(100,100,100,30); 
		
		rb3=new JRadioButton("Yellow");    
		rb3.setBounds(100,150,80,30);
		
		ButtonGroup bg=new ButtonGroup();    
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		b=new JButton("click");
		
		b.setBounds(100,250,80,30);    
		b.addActionListener(this);
		
		add(rb1);
		add(rb2);
		add(rb3);
		add(b);
		
		setSize(300,500);    
		setLayout(null);    
		setVisible(true);    
	}    
	public void actionPerformed(ActionEvent e)
	{    
		if(rb1.isSelected())
		{    
		JOptionPane.showMessageDialog(this,"Go.");    
		}    
		if(rb2.isSelected())
		{    
		JOptionPane.showMessageDialog(this,"Stop.");    
		} 
		if(rb3.isSelected())
		{    
		JOptionPane.showMessageDialog(this,"Ready.");    
		} 
	}    
	public static void main(String args[]){ 
		// TODO Auto-generated method stub
	new RadioButtonExample();    
	}
}   