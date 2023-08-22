import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class KTest1 extends JFrame implements
ActionListener
{
JButton b1,b2;
 JTextField jtf;
KTest1()
{
	b1 = new JButton("First");
	b2 = new JButton("Second");
 jtf = new JTextField(20);
 setLayout(new FlowLayout());
 setSize(300,300);
 add (b1);
 add (b2); 
 add(jtf);
 b1.addActionListener(this);
 b2.addActionListener(this);
 setVisible(true);
 	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	jtf.setText("first Button is clicked");
	else
	jtf.setText("Second Button is clicked"); 
}
public static void main(String arg[])
{
new KTest1();
}
}