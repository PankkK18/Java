import java.swing.*;
/*
<applet code="Pracical" width="500" height="500"
</applet>
*/

public class Practical extends JApplet
{
    public void init()
    {
        setLayout(null);
        JTextField tf1,tf2;
        JButton bt1;

        JLabel lb1=new JLabel();
        lb1.setBounds(80,30,80,30);
        add(lb1);

        JLabel lb2=new JLabel();
        lb2.setBounds(80,30,80,30);
        add(lb2);

        tf1=new TextField(15);
        tf1.setBounds(180,80,80,30);
        add(tf1);

        JLabel lb3=new JLabel();
        lb2.setBounds(80,30,80,30);
        add(lb2);

        tf2=new TextField(15);
        tf1.setBounds(180,80,80,30);
        add(tf2);

        bt1=new JButton();
        bt1.setBounds(80,170,80,30);
        add(bt1);
	
	

    }
}
















