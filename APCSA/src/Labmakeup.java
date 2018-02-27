import java.util.Scanner;

public class Labmakeup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list:");
		String userList = sc.nextLine();
		//System.out.println(userList);
		
		String[] inputs = userList.split("\\s+");
		int[] list = new int[inputs.length];
		for(int i = 0; i< inputs.length; i++){
			list[i] = Integer.parseInt(inputs[i]);
		}
		
		//partition(list);
		
		int[] newList = new int[list[0]];
		
		int counter = 0;
		int pivot = partition(list);
		for(int i = 2; i < list[0]+1; i++){
			if(list[i]<= pivot){
				newList[counter] = list[i];
				counter++;
			}
		}
		newList[counter] = pivot;
		counter++;
		for(int i = 2; i < list[0]+1; i++){
			if(list[i]> pivot){
				newList[counter] = list[i];
				counter++;
			}
		}
		String output = "";
		for(int k : newList){
		 output = output + " " + k;
		}
		System.out.println("After the partition, the list is" + output);
		
		
		
		/*for(int j : list){
			System.out.print(j);
		}*/
		//8 10 1 5 16 61 9 11 1
	}
	
	public static int partition(int[] list){
		
		int pivot = list[1];
		
		return pivot;
		
	}
	
	
}
