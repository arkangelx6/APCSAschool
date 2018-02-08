package Unit4;

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		

	}

	public Name(String s)
	{

		name = s;
		
	}

   public void setName(String s)
   {
	   
	   name = s;

   }

	public String getFirst()
	{
		int spaceIndex = name.indexOf(' ');
		String first  = name.substring(0, spaceIndex);
		
		return first;
		
	}

	public String getLast()
	{
		int spaceIndex = name.indexOf(' ');
		String last  = name.substring(spaceIndex, name.length());
		return last;
	}

 	public String toString()
 	{
 		System.out.println(name);
 		return "";
	}
}