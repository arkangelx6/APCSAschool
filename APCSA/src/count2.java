import java.util.Arrays;

public class count2 {
	
	public static void main(String[] args) {
		
		String[] a = {"a", "c", "z"};
		String[] b = {"b", "f", "z"};
		System.out.println(Arrays.toString(mergeTwo(a, b, 3)));
	}
	public static String[] mergeTwo(String[] a, String[] b, int n) {
		  String[] newArray = new String[n];
		  
		  
		  int startA = 0;
		  int startB = 0;
		  int counter = 0;
		  boolean stop = true;
		  boolean stop2 = true;
		  while(stop && stop2){
			  if(startA == n-1){
			    	stop = false;
			    }
			  if(startB == n-1){
				  stop = false;
			  }
		    System.out.println(startA);
		    System.out.println(startB);
		    int aa = (int)a[startA].charAt(0);
		    int bb = (int)b[startB].charAt(0);
		    
		    if(aa > bb){
		    newArray[counter] = a[startA];
		    counter++;
		    }
		    else if(aa < bb){
		    newArray[counter] = b[startB];
		    counter++;
		    }
		  
		    if(startA <= a.length){
		      startA++;
		    }
		    if(startB <= b.length){
		      startB++;
		    }
		    
		  }
		  
		  
		  
		  return newArray;
		  
		}

}
