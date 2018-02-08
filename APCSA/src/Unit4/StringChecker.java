package Unit4;

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{

	word = s;
	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		char character = c;
		if(word.indexOf(character) != -1){
			
			return true;
		}
		else{
		return false;
		}
	}

	public boolean findSubString(String s)
	{
		String string = s;
		
		if(word.indexOf(string) != -1){
			return true;
		}
		
		else{
		return false;
		}
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}