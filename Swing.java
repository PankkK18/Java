import javax.swing.*;

public class Swing {
    public static void main( String args[])
    {
       JFrame f=new JFrame();
        

        JButton btn1=new JButton ();
        btn1.setBounds(30,40,50,50);
        f.add(btn1);

        JTextField tf1=new JTextField();
        tf1.setBounds(30,40,50,50);
        f.add(tf1);

        JCheckBox cb=new JCheckBox();
        cb.setBounds(30,40,50,60);
        f.add(cb);
        
        
        f.setSize(300,400);
        f.setVisible(true);
        f.setLayout(null);
    }
}