import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener
{
    JLabel j1,j2,j3;
JTextField tf1;
JPasswordField pf2;
JButton b1,b2,b3;

 public Login()
{
setTitle("AUTOMATED TELLER MACHINE");

ImageIcon i1 = new ImageIcon(ClassLadder.getSystemResources("icons/logo.jpg"));
Image i2  = i1.getImage().getScaledInstance(100,200,Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(12);
JLabel j1 = new JLabel(i3);
    

}
}
public static void main (String args[])
{
Login l = new Login();
l.setSize(400,500);
l.setVisible(true);
}
