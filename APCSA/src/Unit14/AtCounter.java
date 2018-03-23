package Unit14;

import static java.lang.System.*;

import java.util.Arrays;

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
			
		
			
			
			if(r > 0){
			if(atMat[r-1][c] == '@'){
				//System.out.println(atMat[r-1][c]);
				

					//return countAts(r-1, c);
					countAts(r-1, c);
					
					//return atCount;
			}
			}
			if(r < 9){
				if(atMat[r+1][c] == '@'){
					//System.out.println(atMat[r+1][c]);
					
					countAts(r+1, c);
					//return atCount;
				}
				}
			if(c < 9){
				if(atMat[r][c+1] == '@'){
					//System.out.println(atMat[r][c+1]);
					

					countAts(r, c+1);
					//return atCount;
				}
				}
			if(c > 0){
				if(atMat[r][c-1] == '@'){
					

					countAts(r, c-1);
					//return atCount;
					
				}
				}
			
		}
		else{
			return 0;
		}
		
		
		
		
		//for(char[] x : atMat){
			//System.out.println(Arrays.toString(x));
			//}
		
		
			

		
		/*]]else if(atMat[r][c] == '-'){
			return 0;
		}*/
		
		return atCount;
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
