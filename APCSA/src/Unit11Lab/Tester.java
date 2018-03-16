package Unit11Lab;

import java.util.ArrayList;

import Unit11.Class;
import Unit11.State;
import Unit11.Student;

public class Tester {
	
	public static void main(String[] args) {
	
		double[] list = {67,75,84,56,93,58,78,76,75};
		double[] list2 = {78,95,24,76,13,98,58,36,45};
		double[] list3 = {77,25,44,66,13,55,68,66,65};
		
		//Weather w = new Weather(list);
		State test = new State("California", 3);
		test.addCity(0,new City("San Diego", list));
		test.addCity(1,new City("Los Angeles", list2));
		test.addCity(2,new City("San Jose", list3));	
		
		//System.out.println(list.toString());
		System.out.println(test.toString());
		
	}
}
