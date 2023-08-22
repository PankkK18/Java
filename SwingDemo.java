import javax.swing.*;
class SwingDemo extends JFrame
{
	JLabel jl;
	jButton jb;
	JTextField jtf;
	JPasswordField jpf;
	JCheckBox jcb,jcb1;
	//JList jl1; JComboBox c;
	SwingDemo()
	{
	jl = new JLabel ("Swing Label");
	jb = new JButton ("Swing Button");
	jtf= new TextField("Swing TextField");
	jcb= new JCheckBox("c++");
	jcb1=new JCheckBox ("java");
	jl jl1 = new JList();
		c= new JComboBox ();
	add(j1);
	add(jb);
	add(jtf);
	add(jcb);
	add(jcb1);
	add(jl1);
	add(c);
	}
		public static void main(String args[])
		{
			SwingDemo s= new SwingDemo();
			s.setSize(300,300);
			s.setVisible(true);
			s.setTitle("Swing");
		}
}