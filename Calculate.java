import java.awt.*;
import java.awt.event.*;
 
 public class Calculate extends Frame implements ActionListener
 {
	 Calculate()
	 {
		 TextField tf ;
		 Label l;
		 
		 tf = new TextField("hiiiipankjs ");
		 tf.setBounds(20,30,40,50);
			setSize(300,400);

		setVisible(true);

		 
		 l= new Label("touch" +"me");
		 setBounds(30,40,20,50);
			setSize(300,400);

		setVisible(true);

		 
	 }
	 public void actionPerformed(ActionEvent e)
		{
		}
	 
	 
	 public static void main(String args[])
	 {
		 Calculate c = new Calculate();
	 }
 }