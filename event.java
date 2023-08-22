import java.awt.*;
import java.awt.event.*;

class event extends Frame implements ActionListener
{
    TextField tf1, tf2 ;
    Button b1 ,b2 ;
    public event ()
    {
        setLayout(null);
        tf1 = new TextField(20);
        tf2 = new TextField(20);

        b1 = new Button();
        b2 = new Button();

        add(tf1);
        add(tf2);
        add(b1);
        add(b2);

        
        tf1.setBounds(30,40,50,50);
        tf2.setBounds(30,40,50,50);

        b1.setBounds(30,30,30,30);
        b2.setBounds(30,30,30,30);

        b1.ActionListener(this);

      public void ActionPerformed(ActionEvent ae)
         {
            int s1 = Integer.parseInt(tf1.getText());
            
            int s2 = Integer.parseInt(tf1.getText());
            
            // int s3 = Integer.parseInt(tf1.getText());
            // int s4 = Integer.parseInt(tf1.getText());
            // int s1 = Integer.parseInt(tf1.getText());
            // int s1 = Integer.parseInt(tf1.getText());

        }
        public static void main(String[] args) {
            event e = new event();
            e.setSize(300,400);
            e.setVisible(true);
        }
           
    }
}
