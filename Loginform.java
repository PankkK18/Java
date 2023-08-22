import javax.swing.*;
import java.awt.event.*;

class loginform extends JFrame{
    JLabel lb1,lb2;
    JTextField tf1,tf2;
    JButton btn1,btn2;
    public loginform()
    {
        lb1 = new JLabel("Username");
        lb2 = new JLabel("Password");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);

        lb1.setBounds(20,40,10,10);
        lb2.setBounds(40,40,10,10);
        tf1.setBounds(20,60,10,10);
        tf2.setBounds(40,60,10,10);

        add(lb1);
	add(lb2);
	add(tf1);
	add(tf2);
        btn1 = new JButton("Login");
        btn1.setBounds(60,60,10,10);
        add(btn1);
        add(lb1);
	add(lb2);
	add(tf1);
	add(tf2);

        btn1.addActionListener((ActionListener) this);

    }
    public void actionPerformed(ActionEvent ae)
    {

    }

    public static void main(String[] args) {
       loginform lf1 = new loginform();
       lf1.setSize(200,200);
       lf1.setVisible(true);
    }
}