package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab15d.dat"));

		int size = file.nextInt();
		FancyWords fw;
		while(file.hasNext()){
			fw = new FancyWords(file.nextLine());
			System.out.println(fw.toString());
		}
		
		



	}
}
