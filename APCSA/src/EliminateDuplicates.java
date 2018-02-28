import java.util.Scanner;

/*(Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header: 

public static int[] eliminateDuplicates(int[] list) 

Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 
The distinct numbers are: 1 2 3 6 4 5*/


public class EliminateDuplicates{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		String userList = sc.nextLine();
		
		
		String[] inputs = userList.split("\\s+");
		int[] list = new int[inputs.length];
		for(int i = 0; i< inputs.length; i++){
			list[i] = Integer.parseInt(inputs[i]);
		}
		for(int e : eliminateDuplicates(list)){
		System.out.print(e + " ");
		}
	}
	public static int[] eliminateDuplicates(int[] list) {
		
		int[] newList = {1,2,3,4,5,6,7,8,9,0};
		int[] newList2 = {0,0,0,0,0,0,0,0,0,0};
		
		int counter = 0;
		int counter2 = 0;
		for(int j = 0; j <10; j++){
			for(int i = 0; i< 10; i++){
			if(list[j] == newList[i]){
				newList[i] = 0;
				newList2[counter] = list[j];
				
				//System.out.println(newList2[counter]);
				counter++;
			
			}
			}
			
		}
		int[] newList3 = new int[counter];
		for(int k = 0; k < counter; k++){
			newList3[k] = newList2[k];
		}
		
		return newList3;
		
		
	}
}
