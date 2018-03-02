import java.util.Random;

public class ElevensLabActivity3Questions {
 public static void main(String[] args) {
	
	 /*for(int i = 0; i <100; i++){
	 if(flip().equals("heads")){
		 System.out.println("heads");
	 }
	 else{
		 System.out.println("tails");
	 }
	 }*/
	 int[] array1 = {5,3,4,2,5,9};
	 int[] array2 = {9,2,5,3,5,4};
	System.out.println(arePermutations(array1, array2));
}
 
 public static String flip(){
		
		Random rand = new Random();
		int n = rand.nextInt(3);
		System.out.println(n);
			String heads = "heads";
			String tails = "tails";
		if(n == 0 || n ==1){
			return heads;
		}
		else{
			return tails;
		}
}
 /*
  * Write a static method named arePermutations that, given two int arrays of the same length
but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the
arrays differ only in how their contents are arranged). Otherwise, it should return false.
  */
 public static boolean arePermutations(int[] array1, int[] array2){
	
	 int[] newArray1 = new int[array1.length];
	 int holder = 0;
	 boolean sort = true;
	 
	 while(sort){
		 sort = false;
	 for(int i = 0; i< array1.length-1; i++){
		 if(array1[i]>array1[i+1]){
			 holder = array1[i];
			 array1[i] = array1[i+1];
			 array1[i+1] = holder;
			 sort = true;
		 }
		 
	 }
	 }
	 boolean sort2 = true;
	 while(sort2){
		 sort2 = false;
	 for(int i = 0; i< array2.length-1; i++){
		 if(array2[i]>array2[i+1]){
			 holder = array2[i];
			 array2[i] = array2[i+1];
			 array2[i+1] = holder;
			 sort2 = true;
		 }
		 
	 }
	 }
	 
	 int counter = 0;
	 for(int j = 0; j < array1.length; j++){
		 if(array1[j] == array2[j]){
			 counter++;
		 }
	 }
	
	 if(counter == array1.length){
		 return true;
	 }else{
		 
	 
	return false;
	 }
	 
 }
 

}