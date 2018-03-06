
public class MyInteger {
	public static void main(String[] args) {
		
		int num = 17;
		System.out.println(isEven(num));
		System.out.println(isOdd(num));
		System.out.println(isPrime(num));
		char[] num1 = {1,2,3,4,5};
		System.out.println(parseInt(num1));
	}
	
	int value;
	public MyInteger(){
		int value = 5;
	}
	public MyInteger(int v){
		value = v;
	}
	public int getValue(){
		return value;
	}
	
	public static boolean isEven(int v){
		if(v % 2 == 0){
			return true;
		}
		return false;

	}
	public static boolean isOdd(int v){
		if(isEven(v)){
			return false;
		}
		return true;
	}
	public static boolean isPrime(int v){
		int counter = 0;
		for(int i = 1; i < v; i++){
			if(v%i == 0){
				counter++;
			}
		}
		
		if(counter > 2){
			return false;
		}
		else{
			return true;
		}
	}
	public static boolean isEven(MyInteger x){
		return MyInteger.isEven(x);
	}
	public static boolean isOdd(MyInteger x){
		return MyInteger.isOdd(x);
	}
	public static boolean isPrime(MyInteger x){
		return MyInteger.isPrime(x);
	}
	public boolean equals(int v, int x){
		if(v == x){
			return true;
		}
		return false;
		
	}
	public static boolean equals(MyInteger v, MyInteger x){
		return MyInteger.equals(v, x);
	}
	
	public static int parseInt(char[] x){
		x.toString();
		return value;
	}
	public static int parseInt(String s){
	
	}
}
