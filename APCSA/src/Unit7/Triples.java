package Unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
		greatestCommonFactor(0 , 0, 0);
	}

	public void setNum(int num)
	{

		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		
	
		//int c2 = (int) Math.pow(c, 2);
		
		for(int i = 0; i < number; i++){
			int a2 = (int) Math.pow(i, 2);
			if(a % 2 == 1){
			for(int j = 1; j < number; j+=2){
				int b2 = (int) Math.pow(j, 2);
				for(int k = 0; k<number; k++){
					int c2 = (int) Math.pow(k, 2);
					int cT = a2 + b2;
					if(j != 0 && k != 0 && i != 0){
					if(cT == c2){
						
						
					}
					
				}
					
				}
			}
			}
			else{
				for(int j = 0; j < number; j+=2){
					int b2 = (int) Math.pow(j, 2);
					for(int k = 0; k<number; k++){
						int c2 = (int) Math.pow(k, 2);
						int cT = a2 + b2;
						if(j != 0 && k != 0 && i != 0){
							int[] counter = {0,0};
							
						if(cT == c2){
							
							counter[k%2] = b2%a2;
							if(k>j){
								if(counter[1]>counter[0]){
									System.out.println(i + " " + j + " "+ k);
								}
							}
						
						}
						}
					}
						
					}
			}
		}
		


		return 1;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}