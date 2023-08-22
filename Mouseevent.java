import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Mouseevent1 extends JFrame implements MouseListener {
    JButton btn1;

    Mouseevent1() {
        btn1 = new JButton();
        btn1.setBounds(20, 20, 20, 10);
        add(btn1);

        btn1.addMouseListener(this);


    }

    public void mouseEntered(MouseEvent me) {
        Object ob = me.getSource();

        if(ob == btn1)
        {
        btn1.setBackground(Color.BLUE);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        Object ob = me.getSource();
        if(ob == btn1)
            btn1.setBackground(Color.yellow);

    }

    public void mousePressed(MouseEvent me)
    {

    }

    public void mouseClicked(MouseEvent me) {
        int x=MouseInfo.getPointerInfo().getLocation().x;
        int y=MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(x+","+y);
    }

    public void mouseReleased(MouseEvent me) {
    }


    public static void main(String[] args) {
        Mouseevent1 me = new Mouseevent1();
        me.setSize(300, 300);
        me.setVisible(true);
    }


}

