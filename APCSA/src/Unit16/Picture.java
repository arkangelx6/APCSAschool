package Unit16;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  
	public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < endRow
				&& toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < endCol
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void keepOnlyBlue(){
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	        pixelObj.setGreen(0);
	      }
	    }
  }
  public void negate(){
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(-pixelObj.getRed());
	        pixelObj.setGreen(-pixelObj.getGreen());
	        pixelObj.setBlue(-pixelObj.getBlue());
	      }
	    }
  }
  public void grayscale(){
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	int colorTotal = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
	        pixelObj.setRed(colorTotal);
	        pixelObj.setGreen(colorTotal);
	        pixelObj.setBlue(colorTotal);
	      }
	    }
  }
  public void underwater(){
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	  if(pixelObj.getBlue() > 150 && pixelObj.getRed() < 26){
	        
	    	  }
	    	  else{
	    		  pixelObj.setRed(0);
	  	        pixelObj.setGreen(0);
	  	        pixelObj.setBlue(0);
	    	  }
	    	  
	      }
	    }
  }
  public void mirrorVerticalRightToLeft(){
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = pixels.length-1; row >= 0; row--)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
  }
  public void mirrorHorizontal(){
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    int height = pixels.length;
	    for (int row = 0; row < height/2; row++)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[height - 1 -row][col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    }  
  }
  public void mirrorHorizontalBotToTop(){
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel bottomPixel = null;
	    int height = pixels.length;
	    for (int row = height/2-1; row >= 0 ; row--)
	    {
	      for (int col = 0; col < pixels[0].length; col++)
	      {
	        topPixel = pixels[row][col];
	        bottomPixel = pixels[height - 1 -row][col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	    }  
  }
  
  public void mirrorArms() {
	  mirrorArms1();
	  mirrorArms2();
  }
  
  
  public void mirrorArms1()
  {
    int mirrorPoint = 192;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 155; row < mirrorPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 100; col < 170; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[mirrorPoint - row +mirrorPoint][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorArms2()
  {
    int mirrorPoint = 192;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 168; row < mirrorPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 239; col < 297; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[mirrorPoint - row +mirrorPoint][col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorGull() {
	  int mirrorPoint = 342;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 226; row < 332; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 235; col < mirrorPoint; col++)
	      {
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
  }
  
  public void blur(int x, int y, int height, int width){
	  
	    Pixel pixelObj = null;
	    Pixel pixelObj2 = null;
	    Pixel pixelObj3 = null;
	    Pixel pixelObj4 = null;
	    Pixel pixelObj5 = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	   int colorTotalRed = 0;
	   int colorTotalGreen = 0;
	  int colorTotalBlue = 0;
	 
	   
	    for (int row = x; row < height-4; row++)
	    {
	      
	      for (int col = y; col < width-4; col++)
	      {
	    	pixelObj = pixels[row][col]; 
	    	pixelObj2 = pixels[row+1][col];
	    	pixelObj3 = pixels[row-1][col];
	    	pixelObj4 = pixels[row][col+1];
	    	pixelObj5 = pixels[row][col-1];
	    	colorTotalRed = (pixelObj.getRed() + pixelObj2.getRed() + pixelObj3.getRed() + pixelObj4.getRed() + pixelObj5.getRed())/5;
	    	colorTotalGreen = (pixelObj2.getGreen() + pixelObj3.getGreen() + pixelObj4.getGreen() +pixelObj5.getGreen() + pixelObj.getGreen())/5;
	    	colorTotalBlue = (pixelObj2.getBlue() + pixelObj3.getBlue() + pixelObj4.getBlue() + pixelObj5.getBlue() + pixelObj.getBlue())/5;
	    	
	    	
	        pixelObj.setRed(colorTotalRed);
	        pixelObj.setGreen(colorTotalGreen);
	       	pixelObj.setBlue(colorTotalBlue);
	      
	      }
	    }
	    
	   
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    /*Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();*/
	  Picture flower = new Picture("redMotorcycle.jpg");
	    flower.explore();
	    flower.blur(25, 25, 400, 400);
	    flower.blur(25, 25, 400, 400);
	    flower.blur(25, 25, 400, 400);
	    flower.blur(25, 25, 400, 400);
	    flower.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this