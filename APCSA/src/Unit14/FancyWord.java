package Unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		
	}

   public FancyWord(String s)
	{
	   
	   char[] letters = s.toCharArray();
	   mat = new char[letters.length][letters.length];
	   int counter = 0;
	   
	   boolean first = true;
	   if(letters.length >= 2){
	   for(int i = 0; i < letters.length; i++){
		  mat[0][i] = letters[i]; 
		  mat[letters.length-1][i] = letters[i]; 
		  if(counter != letters.length-1){
		  mat[counter][i] = s.charAt(i);
		  counter++;
		  }
		
	   }
	   counter = 0;
	   for(int i = letters.length-1; i > 0 ; i--){
			  if(counter != letters.length-1){
			  mat[counter][i] = s.charAt(i);
			  counter++;
			  }
			
		   }
	   } else{
		   mat[0][0] = letters[0]; 
	   }

	}

	public String toString()
	{
		String output="";

		for(char[] x : mat){
			for(char c : x){
				output += c;
			}
			output += "\n";
		}



		return output+"\n\n";
	}
}