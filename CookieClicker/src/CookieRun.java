


import javax.swing.JFrame;
	import java.awt.Component;
public class CookieRun extends JFrame{
	
	
		private static final int WIDTH = 800;
		private static final int HEIGHT = 600;

		public CookieRun()
		{
			super("CookieClicker");
			setSize(WIDTH,HEIGHT);

			CookieScreen theGame = new CookieScreen();
			((Component)theGame).setFocusable(true);

			getContentPane().add(theGame);

			setVisible(true);
		}

		public static void main( String args[] )
		{
			CookieScreen run = new CookieScreen();
		}
	}

