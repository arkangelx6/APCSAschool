package Unit2.Assignments;

import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
	area = Math.PI * Math.pow(radius, 2.0);
	}

	public void print( )
	{
		
		System.out.println("Area of circle with radius: " + radius + " = " + area);
	}
}