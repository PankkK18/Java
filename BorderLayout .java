import java.awt.*;

 class BorderLayout extends Frame

{
	public BorderLayout()
	{

		this.setLayout(newBoederLayout());
		
		Font f=new Font("ITALIC",Font.ARIAL.30);
		
		Button btn1=new Button("EAST");
		Button btn1=new Button("WEST");
		Button btn1=new Button("NORTH");
		Button btn1=new Button("SOUTH");
		Button btn1=new Button("CENTER");

		btn1.setFont(f);
		btn2.setFont(f);
		btn3.setFont(f);
		btn4.setFont(f);
		btn5.setFont(f);

		this.add(btn1,BorderLayout.NORTH);
		this.add(btn1,BorderLayout.SOUTH);
		this.add(btn1,BorderLayout.EAST);
		this.add(btn1,BorderLayout.WEST);
		this.add(btn1,BorderLayout.CENTER);
	
	}
	public static void main(Stringsarg[])
	{
		BorderLayout b1=new BorderLayout();
		b1.setSize(300,300);
		b1.setVisible(true);
	}
}