package Unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab18e.dat"));

		int size = file.nextInt();
		
		
		//file.nextLine();
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(file.hasNext()){
			list.add(file.nextLine());
		}
		for(String s : list){
			System.out.println(s);
		}
		boolean sort = true;
		while(sort){
			sort = false;
			for(int i = 0; i < size; i++){
				Word2 word = new Word2(list.get(i));
				Word2 word2 = new Word2(list.get(i+1));
				String holder = "";
				if(word.compareTo(word2) == 1){
					holder = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, holder);
					sort = true;
				}
				
				
				
			}
			
			
			
		}



		for(String s : list){
			System.out.println(s);
		}




	}
}