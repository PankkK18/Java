import java.awt.*;
public class BorderLayout1 extends Frame
{
    public BorderLayout1()
    {
        this.setLayout(new BorderLayout1());

        Font f=("Arial",Font,ARIAL,30);

        Button btn1=new Button("EAST");
        Button btn2=new Button("WEST");
        Button btn3=new Button("SOUTH");
        Button btn4=new Button("NORTH");
        Button btn5=new Button("CENTER");

        btn1.setFont(f);
        btn2.setFont(f);
        btn3.setFont(f);
        btn4.setFont(f);
        btn5.setFont(f);

        this.add(btn1,BorderLayout1.EAST);
        this.add(btn2,BorderLayout1.WEST);
        this.add(btn3,BorderLayout1.SOUTH);
        this.add(btn4,BorderLayout1.NORTH);
        this.add(btn5,BorderLayout1.CENTER);
    }
    public static void main(String args[])
    {
        BorderLayout1 b1= new BorderLayout1();
        b1.setSize(300,333);
        b1.setVisible(True);
    }
}