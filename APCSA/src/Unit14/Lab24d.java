package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		
		
		int dataSet = file.nextInt();
		file.nextLine();
		for(int i = 0; i< dataSet; i++){
			
			TicTacToe ttt = new TicTacToe(file.nextLine());
			ttt.toString();
		}




	}
}

