import java.awt.*;
public class AwtApp extends Frame
{
AwtApp()
{
	Label firstName = new Label("First Name");
	firstName.setBounds(20,50,50,20);

	Label LastName = new Label("Last Name");
	lastName.setBounds(20,50,50,20);

	Label dobName = new Label("date of birth Name");
	dob.setBounds(20,50,50,20);
	
	TextField firstNameTF = new TextField();
	FirstNameTF.setBounds(120,80,100,20);

	TextField firstNameTF = new TextField();
	FirstNameTF.setBounds(120,80,100,20);


	TextField lastNameTF = new TextField();
	LastNameTF.setBounds(120,80,100,20);


	TextField dobNameTF = new TextField();
	dobNameTF.setBounds(120,80,100,20);

	Button sbmt = new Button ("SUBMIT");
	sbmt.setBounds(20,160,100,30);
	
	Button sbmt = new Button ("RESET");
	reset.setBounds(20,160,100,30);

	
	add(firstName);

	add(lastName);

	add(dob);

	add(firstNameTF);

	add(lastNameTF);

	add(dobTF);
	add(sbmt);

	add(reset);

	setSize(300,300);
	setLayout(null);
	setVisible(true);
	}
	public static void main(String[] args)
	{
	AwtApp awt = new AwtApp();
	}
}

