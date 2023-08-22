import java.awt.*;
import java.awt.event.*;

public class Label2 extends Frame implements ActionListener
{
	TextField tf ;
	Label l1 ;
	Button b1 ;
	
	
	Label2()
	{
		tf = new TextField();
		tf.setBounds(30,30,40,50);
		
		l1 = new Label();
		l1.setBounds(40,50,60,70);
		
		
		b1= new Button("FindIT");
		b1.setBounds(50,150,100,250);
		add(b1);
		add(tf);
		add(l1);
		
		setSize(400,400);
		setLayout(null);
		setvisible(true);
		
	}
	
	public void ActionPerformed(ActionEvent e)
	{
		try
		{
			String host =tf.gethost();
			String i p= java.netAddress.getByName(host).getHostAddress();
			
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}
	}
	publix static void main(String args[])
	{
		new Label2();
	}
}
		