import java.swing.*;
public class  Sex extends Frame
{	public Sex()

	{
		this.setLayout(new BorderLayout());
		
		Font f=new Font("ITALIC",Font.ARIAL,30);
		
		Button btn1=new Button("Female Sex");
		Button btn2=new Button("Male Sex");
		Button btn3=new Button("Others Sex");

		btn1.setFont(f);
		btn2.setFont(f);
		btn3.setFont(f);
	
		this.add (btn1,BorderLayout.Female Sex);
		this.add (btn2,BorderLayout.Male Sex);
		this.add (btn3,BorderLayout.Others Sex);
	}
	public static void main(String args[])
	{
		BorderLAyout b1=new BorderLayout();
		b1.setSize(300,300);
		b1.setVisible(true);
	}
}


		
		