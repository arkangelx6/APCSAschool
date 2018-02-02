package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      	head(window);
      //call head method
      upperBody(window);
      //call other methods
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
     // window.setColor(Color.YELLOW);

     // window.fillOval(300, 100, 200, 100);

      window.setColor(Color.BLUE);
		//window.drawOval(410, 120, 70, 70);
		window.fillOval(410, 120, 70, 70);
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   	window.setColor(Color.YELLOW);
		//window.drawRect(400, 200, 90, 140);
		window.fillRect(400, 200, 90, 140);
	   
	   	window.setColor(Color.GREEN);
		//window.drawRect(490, 200, 40, 110);
		window.fillRect(490, 200, 40, 110);
		
		window.setColor(Color.GREEN);
		//window.drawRect(320, 200, 80, 50);
		window.fillRect(320, 200, 80, 50);
		//add more code here
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.BLACK);
		//window.drawRect(400, 340, 40, 110);
		window.fillRect(400, 340, 40, 110);
		
		
		window.setColor(Color.BLACK);
		//window.drawRect(450, 340, 40, 110);
		window.fillRect(450, 340, 40, 110);
		//add more code here

   }
}