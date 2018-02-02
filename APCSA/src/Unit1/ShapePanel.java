package Unit1;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
		//tell your shape to draw
		/*window.setColor(Color.BLACK);
		window.drawRect(40, 90, 50, 70);
		window.fillRect(40, 90, 50, 70);
		//instantiate a Shape
		//tell your shape to draw
		window.setColor(Color.YELLOW);
		window.drawRect(400, 200, 90, 140);
		window.fillRect(400, 200, 90, 140);
		//instantiate a Shape
		//tell your shape to draw
		
		window.setColor(Color.BLUE);
		window.drawOval(410, 120, 70, 70);
		window.fillOval(410, 120, 70, 70);
		
		window.setColor(Color.BLACK);
		window.drawRect(400, 340, 40, 110);
		window.fillRect(400, 340, 40, 110);
		
		
		window.setColor(Color.BLACK);
		window.drawRect(450, 340, 40, 110);
		window.fillRect(450, 340, 40, 110);
		
		window.setColor(Color.GREEN);
		window.drawRect(490, 200, 40, 110);
		window.fillRect(490, 200, 40, 110);
		
		window.setColor(Color.GREEN);
		window.drawRect(320, 200, 80, 50);
		window.fillRect(320, 200, 80, 50);
		
		window.setColor(Color.GREEN);
		window.drawRect(240, 390, 250, 70);
		window.fillRect(240, 390, 250, 70);*/
	}
}