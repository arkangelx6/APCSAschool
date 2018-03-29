package Unit15;

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y){
		super(x, y);
		
	}
   public Paddle(int x, int y, int s){
		super(x, y);
		speed = s;
		
	}
	public Paddle(int x, int y, int w, int h, int s){
		super(x, y, w, h);
		speed = s;
	}
	public Paddle(int x, int y, Color c){
		super(x, y, c);
	}
	public Paddle(int x, int y, int w, int h, Color c){
		super(x, y, w, h, c);
	}
	public Paddle(int x, int y, int w, int h, Color c, int s){
		super(x, y, w, h, c);
		speed = s;
	}








   public void moveUpAndDraw(Graphics window)
   {
	   
	   super.draw(window, Color.WHITE);
     
      setY(getY()-speed);
		
      super.draw(window);
	 

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	     
	      setY(getY()+speed);
			
	      super.draw(window);

   }

   //add get methods
   public int getSpeed(){
	   return speed;
   }
   
   //add a toString() method
   public String toString(){
   	String output = "";
   	output += "x: " + getX() + " y: " + getY() + " width: " + getWidth() + " height: " + getHeight() + " color: " + getColor();
   	output += " speed: " + getSpeed();	
   	
   	return output;
   	
   }
   
   
}