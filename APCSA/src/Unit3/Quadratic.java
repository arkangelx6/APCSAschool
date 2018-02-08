package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		

 	}

	public void calcRoots( )
	{
		double bsquared = Math.pow(b, 2);
		double discriminant = bsquared - (4 *a * c);
		double squareRoot = Math.pow(discriminant, 0.5);
		rootOne = (-b + squareRoot)/(2*a);
		rootTwo = (-b - squareRoot)/(2*a);

	}

	public void print( )
	{
		System.out.println(rootOne);
		System.out.println(rootTwo);

	}
}