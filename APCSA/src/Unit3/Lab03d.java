package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		
		Scanner sc = new Scanner(System.in);
	   	
	   	System.out.println("Enter X1: ");
	   	int x1 = sc.nextInt();
	   	System.out.println("Enter Y1: ");
	   	int y1 = sc.nextInt();
	   	System.out.println("Enter X2: ");
	   	int x2 = sc.nextInt();
	   	System.out.println("Enter Y2: ");
	   	int y2 = sc.nextInt();
	   	
	   	Distance distance = new Distance(x1, y1, x2, y2);
	   	
	   	distance.calcDistance();
	   	distance.print();
		
			
	}
}