import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KTest1 extends JFrame implements 
ActionListener

{
	JButton b1,b2;
	JTextField t1,t2;
	JLabel l1,l2,l3;
	KTest1 ()
	{
		b1 = new JButton ("addition");
		b2 = new JButton ("subtrsction");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		l1 = new JLabel("First Number");
		l2 = new JLabel("Second Number");
		l3 = new JLabel("	");
		
		setLayout(new FlowLayout());
		setSize(300,300);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public void actionPerformed(ActionEvent e)
		{
			int n1,n2,r;
		n1= Integer.parseInt(t1.getText());
		n2= Integer.parseInt(t2.getText());
		  if(e.getSource()==b1)
		  {
		r=n1+n2;
		 l3.setText(""+r);
		}
		   else 
		  {
		r=n1-n2;
		l3.setText(""+r);
		  }
		}
		public static void main(String[] args)
		{
		new KTest1();
	}
}
























