package Unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{

    count = new ArrayList<Integer>();
    letters = new ArrayList<Character>();
    


	}

	public Histogram(char[] values, String fName)
	{
    count = new ArrayList<Integer>();
    letters = new ArrayList<Character>();

    fileName = fName;
    for(char x : values){
      letters.add(x);
      count.add(0);
    }

  
    


		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
    
    
    
  try{
       Scanner file = new Scanner(new File(fileName));
       int counter = 0;
       while(file.hasNext()){
         String next = file.next();
         char x = next.charAt(0);
         
         for(int j = 0; j < letters.size(); j++){
           
            if(x == letters.get(j)){
           
           counter++;
           count.set(j, count.get(j) + 1);
         }
          
         }
         
       }
       
       
  }
  catch(Exception e)
		{
	  System.out.println("help");
		}



	}

	public char mostFrequent()
	{
		
		
		int max = count.get(0);
		int maxIndex = 0;
		for(int i = 0; i < count.size(); i++){
			if(max<=count.get(i)){
				max = count.get(i);
				maxIndex = i;
			}
		}
		
		
		return letters.get(maxIndex);
	}

	public char leastFrequent()
	{
		int min = count.get(0);
		int minIndex = 0;
		for(int i = 0; i < count.size(); i++){
			if(min>=count.get(i)){
				min = count.get(i);
				minIndex = i;
			}
		}
		
		
		return letters.get(minIndex);

		
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}