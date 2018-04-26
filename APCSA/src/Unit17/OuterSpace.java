package Unit17;

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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	

	// uncomment once you are ready for this part
	
	private ArrayList<Alien> aliens;
	
	private ArrayList<Ammo> shots;
	Ammo ammo1;

	private boolean[] keys;
	private BufferedImage back;

		boolean space = false;
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship = new Ship(200, 200, 3);
		
		//alienOne = new Alien(50, 50, 2);
		//alienTwo = new Alien(50, 100, 2);
		
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < 5; i++){
			aliens.add(new Alien((int)(Math.random()*700+50),(int)( Math.random()*300+50), 2));
		}
		
		
		
		shots = new ArrayList<Ammo>();
		for(int i = 0; i < 10; i++){
		Ammo ammo = new Ammo();
		shots.add(ammo);
		}
		ammo1 = new Ammo();
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }
   boolean left = false;
   int counter = 0;
   int score = 0;
	public void paint( Graphics window )
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

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		graphToBack.setColor(Color.PINK);
		graphToBack.drawString("Score: " + score, 35, 15);
		
		
		
		
		
		
		
		
		for(int i = 0; i < aliens.size(); i++){
		if(left){
			if(aliens.get(i).getX() >= 0 && aliens.get(i).getX() <= 700){
				aliens.get(i).move("LEFT");
				}
			}
			if(left == false){
				if(aliens.get(i).getX() >= 0 && aliens.get(i).getX() <= 700){
					aliens.get(i).move("RIGHT");
				}
			}
			
			if(aliens.get(i).getX() <= 20){
				//System.out.println("not left");
				left = false;
				aliens.get(i).setPos((int)(Math.random()*700+50),(int)( Math.random()*300+50));
			}
			if(aliens.get(i).getX() >= 680){
				//System.out.println("left");
				left = true;
				aliens.get(i).setPos((int)(Math.random()*700+50),(int)( Math.random()*300+50));
			}
			
			
			
			
		}
		
		for(int i = 0; i< aliens.size(); i++){
			aliens.get(i).draw(graphToBack);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*
		if(left){
		if(alienOne.getX() >= 0 && alienOne.getX() <= 700){
			alienOne.move("LEFT");
			}
		}
		if(left == false){
			if(alienOne.getX() >= 0 && alienOne.getX() <= 700){
				alienOne.move("RIGHT");
			}
		}
		
		if(alienOne.getX() == 20){
			System.out.println("not left");
			left = false;
		}
		if(alienOne.getX() == 680){
			System.out.println("left");
			left = true;
		}
		
		alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		*/
		
			
		for(int i = 0; i < shots.size()-1; i++){
			shots.get(i).setSpeed(10);
			shots.get(i).move("UP");
		}
				
		//shots.get(counter).move("UP");
		
		
		ammo1.setSpeed(5);
		ammo1.move("UP");	
			
			
		//ammo1.draw(graphToBack); 
		
		
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}

		if(keys[2] == true)
		{
			ship.move("UP");
		}

		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true){
			
			if(!space){
			shots.get(counter).setX(ship.getX()+35);
			shots.get(counter).setY(ship.getY()+5);
			
			counter++;
			space = true;
			}
			if(counter == shots.size()-1){
				counter = 0;
			}
			
		}
		else{
			space = false;
		}
		
		for(int i = 0; i < shots.size()-1; i++){
			shots.get(i).draw(graphToBack);
		}
				
		
		
		
		
		//add code to move stuff
		if(counter >= 1){
			
			for(int i = 0; i < aliens.size(); i++){
				if((shots.get(counter-1).getY() >= aliens.get(i).getY() && shots.get(counter-1).getY() <= aliens.get(i).getY()+80)
						&& (shots.get(counter-1).getX() >= aliens.get(i).getX() && shots.get(counter-1).getX() <= aliens.get(i).getX()+80)){
					aliens.get(i).setX(4000);
					score++;
					//System.out.println("hit");
				}
				}
			
		System.out.println(shots.get(counter-1).getY());
		}
		else{
			for(int i = 0; i < aliens.size(); i++){
				if((shots.get(8).getY() >= aliens.get(i).getY() && shots.get(8).getY() <= aliens.get(i).getY()+80)
						&& (shots.get(8).getX() >= aliens.get(i).getX() && shots.get(8).getX() <= aliens.get(i).getX()+80)){
					aliens.get(i).setX(4000);
					score++;
					//System.out.println("hit");
				}
				}
			//System.out.println(shots.get(8).getY());	
		}
		//System.out.println(counter);
		//System.out.println("Alien: " + alienOne.getX());
		//add in collision detection
		/*if((ship.getY() >= alienOne.getY() && ship.getY() <= alienOne.getY()+80) && (ship.getX() >= alienOne.getX() && ship.getX() <= alienOne.getX()+80)){
			ship.setX(400);
			
			System.out.println("hit");
		}*/
		
		
		
		

		twoDGraph.drawImage(back, null, 0, 0);
	}
	
	
	

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
			
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}
