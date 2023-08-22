import javax.swing.*;
import java.awt.*;

class ButtonTest extends Frame
{
	ButtonTest()
	{
		setLayout(new FlowLayout());
		JButton buttons[]=new JButton[10];
		String[] names = {"one","Two","Three","Four"};
		
		for (int i = 0; i<buttons.length;i++)
		{
			buttons[i]=new JButton(names[i]);
			add(buttons[i]);
		}
	}

	public void setDefaultCloseOperation(int exitOnClose) {
	}
}
	class Example1
	{
	public static void main(String args[])
	{
		ButtonTest frm= new ButtonTest();
		frm.setTitle("FlowLayout");
		
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(200,200);
		frm.setVisible(true);
	}
}
    

