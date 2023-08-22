import java.awt.*;
public class LoginForm3 extends Frame
{
	public LoginForm3()
	{
		Label FirstName=new Label("First Name");
		FirstName.setBounds(30,30,30,30);
		
		Label SecondName = new Label ("Second Name");
		SecondName.setBounds(30,30,30,30);
	
		Label DOBName = new Label("Date of Birth");
		DOBName.setBounds(30,30,30,30);
		
		TextField FirstNameTF=new TextField();
		FirstNameTF.setBounds(150,100,100,50);
		
		TextField SecondNameTF=new TextField();
		SecondNameTF.setBounds(150,100,100,50);

		TextField DOBNameTF=new TextField();
		DOBNameTF.setBounds(150,100,100,50);
	
		Button btn1=new Button ("SUBMIT");
		btn1.setBounds(150,100,100,50);

		Button btn2=new Button ("RESET");
		btn2.setBounds(150,100,100,50);

		add(FirstName);
		add(SecondName);
		add(DOBName);
		add(FirstNameTF);
		add(SecondNameTF);
		add(DOBNameTF);
		add(btn1);
		add(btn2);

		setSize(500,500);
		setLayout(null);
		setVisible(true);

	}
	public static void main(String args[])
	{
		LoginForm3 LF=new LoginForm3();
	}
}
		
		