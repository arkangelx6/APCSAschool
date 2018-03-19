
import java.util.*;
public class Count {
	public static void main(String[] args) {
		
		int[] list = new int[100];
		for(int i = 0 ; i < 100; i++){
			int x = (int) (Math.random() * 100);
			list[i] = x;
		
		}
		
		for(int p : list){
			System.out.print(p + " ");
		}
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
	
			
		System.out.println("\n" + Arrays.binarySearch(list, 5));
		Timer time = new Timer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find: ");
		int num = sc.nextInt();
		LinearSearch(num, list);
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0;
		Arrays.sort(list);
		Arrays.binarySearch(list, num);
		elapsedTime = (new Date()).getTime() - startTime;
		System.out.println("Binary Search Time: " + elapsedTime);
	}
	public static void LinearSearch(int num, int[] list){
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0;
		for(int i = 0; i < 100; i++){
			if(num == list[i]){
				System.out.println(i);
				
			}
			
		}
		elapsedTime = (new Date()).getTime() - startTime;
		
		System.out.println("Linear Search Time: " + elapsedTime);
	}
}
