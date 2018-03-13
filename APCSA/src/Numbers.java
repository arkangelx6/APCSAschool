import java.util.ArrayList;

public class Numbers {
	public static boolean isGoofy(int num){
		
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for(int i = 1; i <= num; i++){
			if(num%i == 0){
				divisors.add(i);
			}
		}
		
		char[] digits = ("" + num).toCharArray();
		int sum = 0;
		for(int j = 0; j < divisors.size(); j++){
			for(int k = 0; k < digits.length; k++){
				if(digits[k] == divisors.get(j)){
					sum = sum + digits[k];
				}
			}
		}
		
		
		if(sum%2 == 0){
			return false;
		}
		else{
			return true;
		}
		
		
	}
	
	
	public static int[] getSomeGoofyNumbers(int count){
		int[] numbers = new int[count];
		int numberCounter = 0;
		boolean notFilled = true;
		int counter = 1;
		int counter2 = 0;
		while(notFilled){
			for(int i = counter2; i < counter; i++){
				if(isGoofy(counter2)){
					numbers[numberCounter] = counter2;
					numberCounter++;
				}
			}
			counter2 = counter;
			counter++;
			if(numberCounter == (count-1)){
				notFilled = false;
			}
		}
		return numbers;
	}
	
	public static void main(String[] args) {
		for(int i : getSomeGoofyNumbers(35)){
		System.out.println(i);
	}
	}
}
