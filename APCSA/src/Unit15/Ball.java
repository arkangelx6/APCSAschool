package Unit15;

//Name -
//Date -
//Class -
//Lab  -

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

	@Override
	public boolean didCollideLeft(Object obj) {
		
		/*if(this.getX() <= ((Block) obj).getX() + ((Block) obj).getWidth() ){
			if(this.getY() <= ((Block) obj).getY()  &&  this.getY() >= ((Block) obj).getY() + ((Block) obj).getHeight())
			//return true;
			
		}*/
		
		//System.out.println("paddle: " +((Block) obj).getX());
		//System.out.println("ball: " + this.getX());
		
			
			
			if(this.getY() >= ((Block) obj).getY()
			&& this.getY()<= ((Block) obj).getY() + ((Block) obj).getHeight()
			&& this.getX() < ((Block) obj).getX() + ((Block) obj).getWidth()
			&& this.getX() + this.getWidth() >= ((Block) obj).getX()){
				return true;
			}
			
		
		
		
		return false;
		
		
		
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		
		
		
			if(this.getY() >= ((Block) obj).getY() &&
				this.getY() + this.getHeight() <= ((Block) obj).getY() + ((Block) obj).getHeight() &&
				this.getX() < ((Block) obj).getX() + ((Block) obj).getWidth()
				&& this.getX() + this.getWidth() >= ((Block) obj).getX() ){
				return true;
			}
			
		
		
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
}