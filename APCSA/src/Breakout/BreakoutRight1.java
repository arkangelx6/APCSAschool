package Breakout;



import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class BreakoutRight1 extends Canvas implements KeyListener, Runnable{
	private Ball ball;
	private Paddle leftPaddle;
	private boolean[] keys;
	private BufferedImage back;
	int score = 0;
	Block[][] blocks;
	
	public BreakoutRight1()
	{
		//set up all variables related to the game

		ball = new Ball(200, 200, 20, 20, Color.BLACK, 3, 3);
		
		leftPaddle = new Paddle(50, 50, 15, 120, Color.cyan, 5);
		
		blocks = new Block[5][4];
		int row = 600;
		int col = 50;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 4; j++){
				blocks[i][j] = new Block(row, col, 20, 70, Color.PINK);
				row += 50;
			}
			col += 100;
			row = 600;
		}
		
		System.out.println("Kevin Cheng \n Period 3 \n 4/4/18 \n Computer15");
		
		
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	boolean restart = false;
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
	//	Graphics graphToBack = back.createGraphics();
	//	graphToBack.setColor(Color.white);
		window = back.createGraphics();
		window.setColor(Color.white);
		
		window.drawString("Score: " + score, 300, 20);
		
		
		
		window.setColor(Color.BLACK);
		ball.moveAndDraw(window);
		leftPaddle.draw(window);
		
		if(restart){
			ball = new Ball(200, 200, 20, 20, Color.BLACK, 3, 3);
			int row = 600;
			int col = 50;
			for(int i = 0; i < 5; i++){
				for(int j = 0; j < 4; j++){
					blocks[i][j] = new Block(row, col, 20, 70, Color.PINK);
					row += 50;
				}
				col += 100;
				row = 600;
			}
			
			score = 0;
			restart = false;
		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 4; j++){
				
			if(blocks[i][j] != null){
				if((ball.didCollideRight(blocks[i][j]) || ball.didCollideLeft(blocks[i][j]) || ball.didCollideTop(blocks[i][j])
						|| ball.didCollideBottom(blocks[i][j])) && blocks[i][j].getColor() != Color.WHITE) {
					blocks[i][j].draw(window, Color.white);
					//blocks[i][j] = new Block(blocks[i][j].getX() , blocks[i][j].getY(), 20, 70, Color.WHITE);
					blocks[i][j] = null;
					ball.setXSpeed(-ball.getXSpeed());
					//System.out.println("hhh");
					score++;
					
				}
				/*else if((ball.didCollideTop(blocks[i][j]) || ball.didCollideBottom(blocks[i][j])) && blocks[i][j].getColor() != Color.WHITE){
					//blocks[i][j] = new Block(blocks[i][j].getX() , blocks[i][j].getY(), 20, 70, Color.WHITE);
					blocks[i][j].setColor(Color.white);;
					blocks[i][j].draw(window);
					blocks[i][j] = null;
					ball.setYSpeed(-ball.getYSpeed());
					
					score++;
				}*/ else{
					
					blocks[i][j].draw(window);
					//System.out.println("hi");
					
				}
			}
				
		
			}
		}
		

		//see if ball hits left wall or right wall
		
		if(!(ball.getX()>= -20))
		{
			
			//ball.setColor(Color.WHITE);
			restart = true;
			
		}
		if(!(ball.getX()<=750))
		{
			
			ball.setXSpeed(-ball.getXSpeed());
			
			
		}
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		
		//see if the ball hits the top or bottom wall 

		if(ball.didCollideRight(leftPaddle) || ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
	

		
		
		
		
		window.setColor(Color.BLACK);
		window.drawString("Score: " + score, 300, 20);


		//see if the paddles need to be moved

		
		
		if(keys[0] == true)
		{
			
			leftPaddle.moveUpAndDraw(window);
		}
		if(keys[1] == true)
		{
			
			leftPaddle.moveDownAndDraw(window);

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

	
	


