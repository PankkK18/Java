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
		tf.setBounds(20,30,40,50);
		
		l1 = new Label();
		l1.setBounds(60,70,80,90);
		
		
		b1= new Button("FindIT");
		b1.setBounds(100,110,120,130);
		add(b1);
		add(tf);
		add(l1);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String host =tf.getText();
			String ip= java.net.InetAddress.getByName(host).getHostAddress();
			l1.setText("IP of"+host+"is"+ip);
			
		}
		catch(Exception a)
		
		{
			System.out.println(a);
		}
	}
	public static void main(String args[])
	{
		new Label2();
		
	}
}
		