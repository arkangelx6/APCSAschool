package Unit13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output = "";
		int max = Integer.MIN_VALUE;
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> length = new ArrayList<Integer>();
		for(int j = 0; j< wordRay.length; j++){
			String[] s = wordRay[j].split("");
			for(String x : s){
				list.add(x);
			}
			length.add(wordRay[j].length());
		}
	
		
		int holder = 0;
		
		
		for(int i = length.size()-1; i > 0; i--){
		
			output = output + list.get(length.get(i)+holder);
			
			holder = length.get(i) +holder;
			
			
		
		}
		
		
		
		
		
		//output = output + length.toString() + "\n" + Arrays.toString(wordRay) + "\n" + list.toString();
		/*for(String l : list){
			output = output + " " + l;
		}*/
		return output+"\n\n";
		
	}
}