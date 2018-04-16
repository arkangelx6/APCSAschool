package Unit15;



//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class Game extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Game()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		BreakoutRight game = new BreakoutRight();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Game run = new Game();
	}
}
