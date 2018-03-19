package Unit13;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class InsertionSort {
	private ArrayList<String> list;

	public InsertionSort() {
		list = new ArrayList<String>();
	}

	// modfiers
	public void add(String word) {
		
		list.add(word);
		
		int loc = Math.abs(Collections.binarySearch(list, word));
		//System.out.println(loc);
		ArrayList<Character> c = new ArrayList<Character>();
		/*for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(word)) {
				//return;
			}
		}*/

		for (int j = 0; j < list.size(); j++) {
			char a = list.get(j).charAt(0);
			c.add(a);
		}
		Collections.sort(c);
		
		loc = Math.abs(Collections.binarySearch(c, word.charAt(0)));
		
		list.remove(word);
		/*for(char e : c){
			System.out.println(e);
		}*/
		list.add(loc, word);
		

	}

	public void remove(String word) {

		list.remove(word);

	}

	public String toString() {
		return list.toString();
	}
}