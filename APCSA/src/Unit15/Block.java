package Unit15;

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	
	
	public Block(int x, int y){
		xPos = x; 
		yPos = y;
		
	}
	public Block(int x, int y, int w, int h){
		xPos = x; 
		yPos = y;
		width = w;
		height = h;
		
	}
	public Block(int x, int y, Color c){
		xPos = x; 
		yPos = y;
		color = c;
	}
	public Block(int x, int y, int w, int h, Color c){
		xPos = x; 
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	
	
	
	
	
	public void setX(int x){
		xPos = x;
	}
	public void setY(int y){
		yPos = y;
	}
	public void setWidth(int w){
		width = w;
	}
	public void setHeight(int h){
		height = h;
	}
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
	   window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{

		if(this == obj){
			return true;
		}


		return false;
	}   

   //add the other get methods
    public int getX(){
    	return xPos;
    }
    public int getY(){
    	return yPos;
    }
    public int getWidth(){
    	return width;
    }
    public int getHeight(){
    	return height;
    }
    public Color getColor(){
    	return color;
    }
    
    
    public String toString(){
    	String output = "";
    	output += "x: " + getX() + " y: " + getY() + " width: " + getWidth() + " height: " + getHeight() + " color: " + getColor();
    			
    	
    	return output;
    	
    }

	@Override
	public void setPos(int x, int y) {
		
		xPos = x;
		yPos = y;
		
	}
    
    
    
   //add a toString() method  - x , y , width, height, color
}