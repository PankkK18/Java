import java.awt.*;

public class calculator extends Frame

{  	  
	public calculator()
	{

		this.setLayout(new BorderLayout());

		//Font f=new Font("Arial",Font.BOLD,20);

		Panel p1=new Panel();
		
		TextField tf1=new TextField();
		//tf1.setFont(f);
		p1.setLayout(new GridLayout(5,4));
		


		Button btn1=new Button("AC");
		Button btn2=new Button("<=");
		Button btn3=new Button("%");
		Button btn4=new Button("/");
		Button btn5=new Button("7");
		Button btn6=new Button("8");
		Button btn7=new Button("9");
		Button btn8=new Button("*");
		Button btn9=new Button("4");
		Button btn10=new Button("5");
		Button btn11=new Button("6");
		Button btn12=new Button("-");
		Button btn13=new Button("1");
		Button btn14=new Button("2");
		Button btn15=new Button("3");
		Button btn16=new Button("+");
		Button btn17=new Button(" ");
		Button btn18=new Button("0");
		Button btn19=new Button(".");
		Button btn20=new Button("=");
			



/*		btn1.setFont(f);
		btn2.setFont(f);
		btn3.setFont(f);
		btn4.setFont(f);
		btn5.setFont(f);
		btn6.setFont(f);
		btn7.setFont(f);
		btn8.setFont(f);
		btn9.setFont(f);
		btn10.setFont(f);
		btn11.setFont(f);
		btn12.setFont(f);
		btn13.setFont(f);
		btn14.setFont(f);
		btn15.setFont(f);
		btn16.setFont(f);
		btn17.setFont(f);
		btn18.setFont(f);
		btn19.setFont(f);
		btn20.setFont(f);
		
		*/

		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
		p1.add(btn6);
		p1.add(btn7);
		p1.add(btn8);
		p1.add(btn9);
		p1.add(btn10);
		p1.add(btn11);
		p1.add(btn12);
		p1.add(btn13);
		p1.add(btn14);
		p1.add(btn15);
		p1.add(btn16);
		p1.add(btn17);
		p1.add(btn18);
		p1.add(btn19);
		p1.add(btn20);
		

		this.add(p1,BorderLayout.CENTER);

		this.add(tf1,BorderLayout.NORTH);

		












	}

	public static void main(String arg[])
	{
		calculator c1=new calculator();
		c1.setSize(400,500);
		c1.setVisible(true);
	}
}
