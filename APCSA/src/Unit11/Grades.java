package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.*;

public class Grades
{
	//private double[] grades;
	
	ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);
		
	}
	
	public void setGrades(String gradeList)
	{
		
		Scanner sc = new Scanner(gradeList);
		int counter = 0;
		//grades = new double[sc.nextInt()];
		grades = new ArrayList<Double>();
		//System.out.println(gradeList);
		sc.skip(" ");
		sc.skip("-");
		while(sc.hasNext()){
		sc.skip(" ");
		setGrade(counter, sc.nextDouble());
		counter++;
		}
		


	}
	
	public void setGrade(int spot, double grade)
	{

		//grades[spot] = grade;
		//grades.add(grade);
		grades.set(spot, grade);

	}
	
	public double getSum()
	{
		double sum=0.0;

		for(double x : grades){
			sum += x;
		}


		return sum;
	}
	
	public double getLowGrade()
	{
		/*double low = grades[0];

		for(int i = 0; i< grades.length; i++){
			if(grades[i] < low){
				low = grades[i];
			}
		}*/

		double low = grades.get(0);

		for(int i = 0; i< grades.size(); i++){
			if(grades.get(i) < low){
				grades.set(i, low);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		/*double high = grades[0];

		for(int i = 0; i< grades.length; i++){
			if(grades[i] > high){
				high = grades[i];
			}
		}*/

		double high = grades.get(0);

		for(int i = 0; i< grades.size(); i++){
			if(grades.get(0) > high){
				grades.set(i, high);
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		//return grades.length;
		return grades.size();
	}
	
	public String toString()
	{
		
		//String output="" + Arrays.toString(grades);
		String output="" + grades.toString();




		return output;
	}	
}