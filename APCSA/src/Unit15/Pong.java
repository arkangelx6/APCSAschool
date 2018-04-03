package Unit15;

//� A+ Computer Science  -  www.apluscompsci.com
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
	int player1 = 0;
	int player2 = 0;

	public Pong()
	{
		//set up all variables related to the game


		ball = new Ball(50, 50, 20, 20, Color.pink, 3, 3);
		
		//instantiate a left Paddle
		
		leftPaddle = new Paddle(50, 50, 15, 100, Color.GREEN, 5);
		
		rightPaddle = new Paddle(750, 50, 15, 100, Color.MAGENTA, 5);

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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(getBackground());
		graphToBack.drawString("Player1: " + player1 + " Player2: " + player2, 400, 70);
		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10))
		{
			ball.setXSpeed(-ball.getXSpeed());
			player2++;
			
		}
		if(!(ball.getX()<=780))
		{
			ball.setXSpeed(-ball.getXSpeed());
			player1++;
			
		}
		
		//see if the ball hits the top or bottom wall 
		

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		

		/*if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()+ Math.abs(ball.getXSpeed()) && (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() +leftPaddle.getHeight() || ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() +ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())){
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-ball.getYSpeed());
			}
			else{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}*/
		//see if the ball hits the left paddle
		
		
		if(ball.didCollideRight(leftPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
			//System.out.println("right");
			
		}
		//see if the ball hits the right paddle
		
		if(ball.didCollideLeft(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Score: " , 400, 50);
		graphToBack.drawString("                                                        ", 400, 70);
		graphToBack.drawString("Player1: " + player1 + " Player2: " + player2, 400, 70);
		graphToBack.drawString("                                                        ", 400, 70);
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