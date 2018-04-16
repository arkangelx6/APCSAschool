

package Unit15;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	int counter1 = 0;
	int counter2 = 0;

	public Pong()
	{
		//set up all variables related to the game

		ball = new Ball(200, 200, 20, 20, Color.BLACK, 3, 3);
		
		leftPaddle = new Paddle(50, 50, 15, 120, Color.cyan, 5);
		rightPaddle = new Paddle(650, 50, 15, 120, Color.cyan, 5);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.white);
		
		
		
		
		graphToBack.drawString("Score: Player1: " + counter1 + " Player2: " + counter2, 300, 20);
		
		graphToBack.setColor(Color.BLACK);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		

		//see if ball hits left wall or right wall
		
		if(!(ball.getX()>=10))
		{
			
			ball.setXSpeed(-ball.getXSpeed());
			counter1++;
			
		}
		if(!(ball.getX()<=750))
		{
			
			ball.setXSpeed(-ball.getXSpeed());
			counter2++;
			
		}
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		
		//see if the ball hits the top or bottom wall 

		if(ball.didCollideRight(leftPaddle) || ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideLeft(rightPaddle) || ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollideTop(rightPaddle)|| ball.didCollideBottom(rightPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		
		
		
		//see if the ball hits the right paddle
		
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Score: Player1: " + counter1 + " Player2: " + counter2, 300, 20);


		//see if the paddles need to be moved

		if(keys[0] == true)
		{
			
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}





		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}
