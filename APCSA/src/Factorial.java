
public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		for(int i = 1; i<=10; i++){
			fact *= i;
		}
		System.out.println(fact);
		System.out.println(10*9*8*7*6*5*4*3*2*1);
			
		System.out.println(run(10));	
			
			
	}
	
	public static int run(int x){
		
		if(x == 1){
			return 1;
		}
		
		return run(x-1)*x;
	}

}
