import javax.swing.*;

public class ToolTipDemo
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("ToolTipDemo");
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(100,100,100,30);
		pass.setToolTipText("Enter the Password");
		JLabel lbl=new JLabel("Password:");
		lbl.setBounds(20,100,200,30);
		f.add(pass);
		f.add(lbl);
		f.setSize(300,200);
		f.setLayout(null);
		f.setVisible(true);
	}
}