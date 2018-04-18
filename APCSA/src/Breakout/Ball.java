
package Breakout;



import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
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
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);

	}
	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);

	}
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c);
		xSpeed = xS;
		ySpeed = yS;
	}
	public Ball(int xS, int yS) {
		
		xSpeed = xS;
		ySpeed = yS;
		
	}
	
	
	
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}
	
	public void setYSpeed(int yS) {
		ySpeed = yS;
	}
	
	
	
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   window.setColor(Color.white);
	   //window.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	   window.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
      super.setX(getX()+xSpeed);
		//setY
      super.setY(getY()+ySpeed);
		//draw the ball at its new location
      window.setColor(super.getColor());
      //window.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
      window.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
   }
   
	public boolean equals(Object obj)
	{

		if(this == obj) {
			return true;
		}

		return false;
	}   

   //add the get methods
	public int getYSpeed() {
		
		return ySpeed;
	}
	public int getXSpeed() {
	
	return xSpeed;
	}
   //add a toString() method
	public String toString() {
		
		String output = "";
		
		output += "x: " +getX() + " y: " + getY() + " width: " + getWidth() + " height: " + getHeight() + " Color: " + getColor();
		output += " xS: " +getXSpeed() + " yS: " + getYSpeed();
		return output;
	}

@Override
public boolean didCollideLeft(Object obj) {

	if(this.getY()+this.getHeight()  >= ((Block) obj).getY() &&
		this.getY()+this.getHeight()  <= 	((Block) obj).getY() + ((Block) obj).getHeight() &&
		this.getX() <= ((Block) obj).getX() &&
		this.getX() >= ((Block) obj).getX() - ((Block) obj).getWidth())
			 {
		return true;
	}
	
	
	return false;
}

@Override
public boolean didCollideRight(Object obj) {
	if(this.getY() +this.getHeight() >= ((Block) obj).getY() &&
			this.getY() +this.getHeight() <= ((Block) obj).getY() + ((Block) obj).getHeight() &&
			this.getX() <= ((Block) obj).getX() + ((Block) obj).getWidth() &&
			this.getX() >= ((Block) obj).getX())
				 {
			return true;
		}
	return false;
}

@Override
public boolean didCollideTop(Object obj) {
	if(this.getX()+this.getWidth()  >= ((Block) obj).getX() &&
			this.getX()+this.getWidth()  <= ((Block) obj).getX() + ((Block) obj).getWidth() &&
			this.getY() <= ((Block) obj).getY() &&
			this.getY() >= ((Block) obj).getY() - ((Block) obj).getHeight())
				 {
			return true;
		}
	return false;
}

@Override
public boolean didCollideBottom(Object obj) {
	if(this.getX() +this.getWidth() >= ((Block) obj).getX() &&
			this.getX() +this.getWidth() <= ((Block) obj).getX() + ((Block) obj).getWidth() &&
			this.getY() <= ((Block) obj).getY() + ((Block) obj).getHeight() &&
			this.getY() >= ((Block) obj).getY())
				 {
			return true;
		}
	return false;
}
}
