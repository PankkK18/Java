import javax.swing.*;
public class  Sx extends Frame
{	public Sx()

	{
		this.setLayout(new BorderLayout());
		
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
	private void add(Button btn1, String female) {
}
	private void setLayout(BorderLayout borderLayout) {
}
	public static void main(String args[])
	{
		BorderLayout b1=new BorderLayout();
		b1.setSize(300,300);
		b1.setVisible(true);
	}
}


		
		