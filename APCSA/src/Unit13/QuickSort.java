package Unit13;

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		//System.out.println(Arrays.toString(list));
		//System.out.println((int)list[0]);
	//System.out.println((int)list[list.length-1]);
		passCount = 0;
		quickSort(list, 0, list.length-1);

	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		
		
		if(low < high){
			int spot = partition(list, low, high);
			quickSort(list, low, spot);
			quickSort(list, spot+1, high);
			passCount++;
			System.out.println("pass " + passCount +" " + Arrays.toString(list));
		}
	
		
	}


	private static int partition(Comparable[] list, int low, int high)
	{


		Comparable pivot = list[low];
		int bot = low -1;
		int top = high +1;
		while(bot<top){
			while(list[--top].compareTo(pivot)>0);
			while(list[++bot].compareTo(pivot)<0);
		if(bot >= top){
			return top;
		}
		Comparable temp = list[bot];
		list[bot] = list[top];
		list[top] = temp;
			
				
		}


		return 0;
	}
}
