package Unit12;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{

		word = s;

	}

	public int compareTo( Word rhs )
	{
		char[] word1 =  word.toCharArray();
		char[] word2 = rhs.word.toCharArray();
		if(word1.length > word2.length){
			return 1;
		}
		
		
		
		return 0;
	}

	public String toString()
	{
		return "";
	}
}