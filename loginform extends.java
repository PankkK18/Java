import java.awt.*;
import java.applet.Applet;
/*
<applet code="loginform" width='1000' height='700'>
</applet>
*/
public class loginform extends Applet
{ 
	public void init()
	{
		setLayout(null);
		setBackground(Color.pink);
		Font f1=new Font("Courier",Font.BOLD,30);
		Font f2=new Font("Courier",Font.BOLD,20);

		Label l1= new Label("REGISTRATION FORM",1);
		l1.setSize(1000,30);
		l1.setLocation(0,20);
		l1.setBackground(Color.orange);
		l1.setFont(f1);
		add(l1);

		
		/*Label l2= new Label("Complete Your Form",1);
		l2.setSize(500,40);
		l2.setLocation(50,50);
		l2.setFont(f2);
		add(l2);*/

		Label l3= new Label("First Name : ");
		l3.setSize(150,40);
		l3.setLocation(30,80);
		l3.setFont(f2);
		add(l3);

		TextField t1=new TextField();
		t1.setSize(300…