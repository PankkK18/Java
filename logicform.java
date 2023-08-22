import javax.swing.*;
import java.awt.event.*;

class logicform extends JFrame
	JLabel lb1,lb2;
	JButton btn1,btn2;
	JTextField tf1,tf2;
{
	public logicform()
	{
		lb1=new JLabel("Usernmae");
		lb2=new JLabel("Password");
		tf1=new TextField(15);
		tf2=new TextField(15);

		btn1=new JButton("SUBMIT");
		btn1.setBounds(20,20,20,20);

		btn2=new JButton("RESET");
		btn2.setBounds(20,20,20,20);
		
		add(lb1);
		add(lb2);
		add(tf1);
		add(tf2);
		add(btn1);
		add(btn2);
		
		btn1.addActionListner((ActionListner) this);
		btn2.addActionListner((ActionListner) this);
	}

	public void actionPerformed(ActionListner ae)
	{
	}
	public static void main(String[] args)
	{
		logicform lf1 = new logicform();
		lf1.setSize(300,300);
		lf1.setVisible(true);
	}

}