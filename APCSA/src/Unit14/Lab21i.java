package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File ("lab21i.dat"));
		
		while(file.hasNextLine()){
			int lines = file.nextInt();
			file.nextLine();
			String maze = file.nextLine();
			Maze m = new Maze(lines, maze);
			
			
			if(m.hasExitPath(0, 0)){
				System.out.println("Has exit path");
			
			}
			else{
				System.out.println("No exit path");
				
			}
			
		}
	}
}
