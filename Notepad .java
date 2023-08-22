import java.awt.*;

public class Notepad1 extends Frame {
    Notepad1()
    {
        Frame f = new Frame();
        MenuBar mb1 = new MenuBar();
        Menu m1,m2,m3,m4,m5;
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Format");
        m4 = new Menu("View");
        m5 = new Menu("Help");

        mb1.add(m1);
        mb1.add(m2);
        mb1.add(m3);
        mb1.add(m4);
        mb1.add(m5);


        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("New Window");
        MenuItem mi3 = new MenuItem("Open...");
        MenuItem mi4 = new MenuItem("Save");
        MenuItem mi5 = new MenuItem("Save As...");
        MenuItem mi6 = new MenuItem("Page Setup...");
        MenuItem mi7 = new MenuItem("Print");
        MenuItem mi8 = new MenuItem("Exit");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi5);
        m1.addSeparator();
        m1.add(mi6);
        m1.add(mi7);
        m1.addSeparator();
        m1.add(mi8);


        MenuItem mi9 = new MenuItem("Undo");
        MenuItem mi10 = new MenuItem("Cut");
        MenuItem mi11 = new MenuItem("Copy");
        MenuItem mi12 = new MenuItem("Paste");
        MenuItem mi13 = new MenuItem("Delete");
        MenuItem mi14 = new MenuItem("Search with Bing");
        MenuItem mi15 = new MenuItem("Find");
        MenuItem mi16 = new MenuItem("Find Next");
        MenuItem mi17 = new MenuItem("Find Previous");
        MenuItem mi18 = new MenuItem("Replace");
        MenuItem mi19 = new MenuItem("Go To");
        MenuItem mi20 = new MenuItem("Select All");
        MenuItem mi21 = new MenuItem("Time/Date");
        m2.add(mi9);
        m2.addSeparator();
        m2.add(mi10);
        m2.add(mi11);
        m2.add(mi12);
        m2.add(mi13);
        m2.addSeparator();
        m2.add(mi14);
        m2.add(mi15);
        m2.add(mi16);
        m2.add(mi17);
        m2.add(mi18);
        m2.add(mi19);
        m2.addSeparator();
        m2.add(mi20);
        m2.add(mi21);


        MenuItem mi22 = new MenuItem("Word Wrap");
        MenuItem mi23 = new MenuItem("Font...");
        m3.add(mi22);
        m3.add(mi23);


        MenuItem mi24 = new MenuItem("Zoom");
        MenuItem mi25 = new MenuItem("Status Bar");
        m4.add(mi24);
        m4.add(mi25);


        MenuItem mi26 = new MenuItem("View Help");
        MenuItem mi27 = new MenuItem("Send Feedback");
        MenuItem mi28 = new MenuItem("About Notepad");
        m5.add(mi26);
        m5.add(mi27);
        m5.addSeparator();
        m5.add(mi28);


        TextArea ta1 = new TextArea(300,300);
        f.add(ta1);













        f.setMenuBar(mb1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String args[])
    {
        Notepad1 np1 = new Notepad1();

    }
}