import javax.swing.*;

public class SwingPrograms extends JFrame
{
	public SwingPrograms()
	{
		setLayout(null);
		JTextField tf1,tf2;
		JButton btn1;
		
		JLabel (lb1);
		lb1.setBounds(40,40,40,40);
		add (lb1);
		
		JLabel (lb2);
		lb2.setBounds(40,40,49,59);
		add(lb2);
		
		tf1= new JTextField(15);
		tf1.setBounds(130,129,37,40);
		add(tf1);
	
		tf2=new JTextField(15);
		tf2.setBounds(120,400,50,40);
		add(tf2);
		
		btn1 = new JButton("SUBMIT");
		btn1.setBounds(100,100);
	}
	public static void main(String args[])
	{
	SwingPrograms sp1 = new SwingPrograms();
	sp1.setSize(500,500);
	sp1.setVisible(true);
	
	}
}