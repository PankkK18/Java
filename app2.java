import java.applet.*;
import java.awt.*;

public class app2 extends Applet
{	
	public void init()
	{
		setBackground(Color.gray);
		setForeground(Color.white);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to my Applet",40,25);
	}
}
