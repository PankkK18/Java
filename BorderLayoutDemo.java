import java.awt.*;

public class BorderLayoutDemo extends Frame

{  	  
	public BorderLayoutDemo()
	{

		this.setLayout(new BorderLayout());

		Font f=new Font("ITALIC",Font.ARIAL,30);

		Button btn1=new Button("NORTH");
		Button btn2=new Button("SOUTH");
		Button btn3=new Button("EAST");
		Button btn4=new Button("WEST");
		Button btn5=new Button("CENTER");

		btn1.setFont(f);
		btn2.setFont(f);
		btn3.setFont(f);
		btn4.setFont(f);
		btn5.setFont(f);

		this.add(btn1,BorderLayout.NORTH);
		this.add(btn2,BorderLayout.SOUTH);
		this.add(btn3,BorderLayout.EAST);
		this.add(btn4,BorderLayout.WEST);
		this.add(btn5,BorderLayout.CENTER);
	
	}

	public static void main(String arg[])
	{
		BorderLayoutDemo bl=new BorderLayoutDemo();
		bl.setSize(600,600);
		bl.setVisible(true);
	}
}
