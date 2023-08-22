import javax.swing.*;
public class  BorderLayout3 extends Frame
{	public class BorderLayout3()

	{
		this.setLayout(new BorderLayout3());
		
		Font f=new Font();
		
		Button btn1=new Button();
		Button btn2=new Button();
		Button btn3=new Button();

		btn2.setFont(f);
		btn3.setFont(f);
	
		this.add (btn1,BorderLayout.Female );
		this.add (btn2,BorderLayout.Male );
		this.add (btn3,BorderLayout.Others);
	}
	
	public static void main(String args[])
	{
		BorderLayout3 b1=new BorderLayout3();
		b1.setSize(300,300);
		b1.setVisible(true);
	}
}


		
		