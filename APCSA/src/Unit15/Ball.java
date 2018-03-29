package Unit15;

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y){
		super(x, y);
		
	}
	public Ball(int x, int y, int w, int h){
		super(x, y, w, h);
		
	}
	public Ball(int x, int y, Color c){
		super(x, y, c);
	}
	public Ball(int x, int y, int w, int h, Color c){
		super(x, y, w, h, c);
	}
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS){
		super(x, y, w, h, c);
		xSpeed = xS;
		ySpeed = yS;
	}
	
	
	
	
	
	
	
	public void setXSpeed(int xS){
		xSpeed = xS;
	}
	public void setYSpeed(int yS){
		ySpeed = yS;
	}
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.setColor(Color.WHITE);
	   window.fillOval(getX(), getY(), getWidth(), getHeight());

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      window.setColor(super.getColor());
	   window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{

		if(this == obj){
			return true;
		}


		return false;
	}   
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}

	
	
   //add the get methods
	public String toString(){
    	String output = "";
    	output += "x: " + getX() + " y: " + getY() + " width: " + getWidth() + " height: " + getHeight() + " color: " + getColor();
    	output += " xSpeed: " + getXSpeed() + " ySpeed: "+ getYSpeed();		
    	
    	return output;
    	
    }
   //add a toString() method
}