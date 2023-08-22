import java.awt.*;
class MenuExample1
{
	MenuExample()
	{
		Frame f= new Frame("Menu and MenuItem");
		MenuBar bmb= new MenuBar();
		Menu menu=new Menu("Sub Menu");
		MenuItem i1=new MenuItem("Item 1");
		MenuItem i2=new MenuItem("Item 2");
		MenuItem i3=new MenuItem("Item 3");
		MenuItem i4=new MenuItem("Item 4");
		MenuItem i5=new MenuItem("Item 5");
		
		menu.add(i1);
		menu.add(i2);
		submenu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		f.setMenuBar(mb);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public staitc void main(String args[])
	{
		new MenuExample1();
	}
}