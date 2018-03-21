package Unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if(atMat[r][c] == '@'){
			atCount++;
			atMat[r][c] = 'v';
			if(atMat[r+1][c] == '@'){
				return countAts(r+1, c);
			}
			if(atMat[r-1][c] == '@'){
				return countAts(r-1, c);
			}
			if(atMat[r][c+1] == '@'){
				return countAts(r, c+1);
			}
			if(atMat[r][c-1] == '@'){
				return countAts(r, c-1);
			}
		}
		if(atMat[r][c] == '-'){
			return 0;
		}

		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}
