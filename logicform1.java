import javax.swing.*;
import java.awt.event.*;

class logicform1 extends JFrame
{
	public logicform1()
	{
		JLabel lb1,lb2;
		JButton btn1,btn2;
		
		lb1=new JLabel("Username");
		lb1.setBounds(20,20,20,20);
		add(lb1);
		
		lb2=new JLabel("Password");
		lb2.setBounds(20,20,20,20);
		add(lb2);
		
		btn1=new JButton();
		btn1.setBounds(20,20,20,20);
		add(btn1);
	}
	public static void main(String args[])
	{
		logicform1 lf1=new logicform1();
		lf1.setSize(500,500);
		lf1.setVisible(true);
		lf1.setLayout(null);
	}
}
		