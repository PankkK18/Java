import java.awt.*;
import.java.awt.event.*;
public class DialogExample
{
	private static Dialog d;
	DialogExample()
	{
		Frame f=new Frame();
		d= new Dialog("f , Dialog Example",true);
		button b= new Button ("ok");
		b.addActionListener (new ActionListener()
	{
		DialogExample.d.setVisible(true);
	}
		});
	d.add(new Label (" Click button to continue."));
	d.add (b);
	d.setSize(400,400);
	d.setVsible(true);
	}
	public static void main(String args[])
{
	new DialogExample();
  }
}