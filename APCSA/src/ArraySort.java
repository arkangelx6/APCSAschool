import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/*(Sort ArrayList) Write the following method that sorts an ArrayList of numbers.  You may not use Collections.sort

public static void sort(ArrayList<Number> list)
*/

public class ArraySort{
	
	
	 
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 25; i++){
			int x = (int) (Math.random()*10);
			list.add(x);
		}
		
		System.out.println(list.toString());
		sort(list);
		System.out.println(list.toString());
		
	}
	
	public static void sort(ArrayList<Integer> list){
		
		int holder = 0;
		
		boolean sort = true;
		while(sort){
			sort = false;
		
		for(int i = 0; i <  list.size()-1; i++){
			
			if(list.get(i) > list.get(i+1)){
			holder = list.get(i);
			list.set(i, list.get(i+1));
			list.set(i+1, holder);
			sort = true;
			}
		}
		
	}
	}
	
}