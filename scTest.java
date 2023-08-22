import javax.swing.*;
 public class ScrollBar
{
 ScrollBar()
{
	JFrame f=new JFrame("this is an Example of ScrollBar");
	JScrollBar s = new JScrollBar();
	s.setBounds(100,50,50,100);
	f.add(s);
	f.setSize(350,300);
	f.setLayout(null);
	f.setVisible(true);
	}
  public static void main(String args[])
	{
new ScrollBar();
}
}