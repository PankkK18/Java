package flappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel
{


	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g); //dicreas the confusion of superclass or subclass when that are same

		FlappyBird.flappyBird.repaint(g);//help to handling update to the paint cycle of the applet
	}
}