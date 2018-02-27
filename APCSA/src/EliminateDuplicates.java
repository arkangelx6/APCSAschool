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
		int[] num = new int[10];
		for(int i = 0; i< 10; i++ ){
		num[i] = sc.nextInt();
		}
		eliminateDuplicates(num);
	}
	public static int[] eliminateDuplicates(int[] list) {
		
		int[] newlist = {1,2,3,4,5,6,7,8,9,0};
		
		for(int j = 0; j <10;)
	
		
		return list;
		
	}
}
