package Unit16;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture temple = new Picture("temple.jpg");
    canvas.createCollage();
    canvas.copy2(temple, 5, 200, 50, 200);
    canvas.explore();
  }
  public static void myCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture temple = new Picture("temple.jpg");
    canvas.createCollage();
    canvas.copy2(temple, 5, 200, 50, 200);
    Picture swan = new Picture("swan.jpg");
    swan.mirrorHorizontal();
    Picture caterpillar = new Picture("caterpillar.jpg");
    Picture snowman = new Picture("snowman.jpg");
    canvas.copy(snowman, 60, 10);
    canvas.copy2(swan, 30, 140, 30, 160);
    canvas.copy(caterpillar, 10, 120);
    
    canvas.mirrorHorizontalBotToTop();
    canvas.mirrorVertical();
    canvas.explore();
  }
  
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.keepOnlyBlue();
    swan.explore();
  }
  public static void testNegate()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.negate();
    swan.explore();
  }
  public static void testGrayscale()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.grayscale();
    swan.explore();
  }
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.underwater();
    water.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.mirrorHorizontalBotToTop();
    swan.explore();
  }
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
	 // testMirrorVerticalRightToLeft();
    //testNegate();
    //testGrayscale();
   // testFixUnderwater();
    //testMirrorVertical();
	 // testMirrorHorizontal();
	 // testMirrorHorizontalBotToTop();
    //testMirrorTemple();
     //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	  //myCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }


}