import javax.swinng.*;
import java.awt.*;
import java.awt.event.*;

public class Demo extends JApplet
{
	JLable lb1;
	public void init()
	{
		setSize(400,400);
		setLayout( new FlowLayout);
		lb1=new JLabel();
		add(lb1);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				lb1.setText("Mouse get clicked");
			}
		}
	}
	
}	