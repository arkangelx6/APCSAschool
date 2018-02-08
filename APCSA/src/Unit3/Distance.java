package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{



	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{



	}

	public void calcDistance()
	{
		double x =  (xTwo - xOne);
		double xSquared = Math.pow(x, 2);
		double y =  (yTwo - yOne);
		double ySquared = Math.pow(y, 2);
		
		double k = xSquared + ySquared;
		distance = Math.pow(k, 0.5);


	}

	public void print( )
	{

		System.out.println(distance);

	}
}