import java.awt.*;
public class Practical extends Frame
{
    public Practical()
{
    setLayout(null);
    

    Label lb1 = new Label("Registration Form");
    lb1.setBounds (300,300,300,300);
    TextField t1 = new TextField();
        t1.setBounds(300,300,300,300);
    Label lb2 = new Label("Age");
        lb2.setBounds(300,300,300,300);
    TextField t2 = new TextField();
        t2.setBounds(300,300,300,300);

    Button btn1 = new Button("submit");
        btn1.setBounds(100,100,100,100);

}
    public static void main(String args[])
    {
        Practical p3=new Practical ();
        p3.setSize(200,200);
        extracted(p3);
    }
    private static void extracted(Practical p3) {
        p3.setVisible (true);
    }
}