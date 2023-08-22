import javax.swing.*;

public class ToolTipDemo1
{

public static void main(String args[])
{
	JFrame f=new JFrame("ToolTip Demo");
	JPasswordField pass =new JPasswordField();
	pass.setBounds(100,100,100,30);
	pass.setToolTipText("Enter the Password");
	JLabel lb1=new JLabel("Password");
	lb1.setBounds(20,100,80,30);
	
	f.add(pass);
	f.add(lb1);
	
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	}
}