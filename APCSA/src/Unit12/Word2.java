package Unit12;

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{

		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;


		char[] vowel = vowels.toCharArray();
		
		char[] w = word.toCharArray();
		
		
		for(int i = 0; i < w.length; i++){
			for(int j = 0; j < vowel.length; j++){
				if(w[i] == vowel[j]){
					vowelCount++;
				}
				
				
			}
		}

		


		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{

		if(numVowels() > rhs.numVowels()){
			return 1;
		}
		else if(numVowels() < rhs.numVowels()){
			return 0;
		}

		else{
	
		return -1;
		}
	}

	public String toString()
	{
		return word;
	}
}