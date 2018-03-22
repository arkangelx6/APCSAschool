import java.util.Arrays;

public class Matrix6 {
	
	static int[][] mat;
	
	public static void main(String[] args) {
		mat  = new int[6][6];
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				
				int x = (int)(Math.random()+ 0.5);
				mat[i][j] = x;
				
				
			}
		}
		for(int[] x : mat){
			System.out.println(Arrays.toString(x));
		}
		int counter = 0;
		for(int l = 0; l < 6; l++){
			counter = 0;
		for(int k = 0; k < 6; k++){
			if(mat[l][k] %2 == 0){
				
			}
			else{
				counter++;
			}
		}
		//System.out.println(counter);
		if(counter%2 ==0){
		 System.out.println("row " + l  + " has an even amount of 1s" );
		}else{
		System.out.println("row " + l  + " has an odd amount of 1s" );
		}
		}
		
		
		for(int l = 0; l < 6; l++){
			counter = 0;
		for(int k = 0; k < 6; k++){
			if(mat[k][l] %2 == 0){
				
			}
			else{
				counter++;
			}
		}
		//System.out.println(counter);
		if(counter%2 ==0){
		 System.out.println("column " + l  + " has an even amount of 1s" );
		}else{
		System.out.println("column " + l  + " has an odd amount of 1s" );
		}
		}
	}
}
