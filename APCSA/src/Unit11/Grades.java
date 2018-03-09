package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
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
		grades = new double[sc.nextInt()];
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

		grades[spot] = grade;


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
		double low = grades[0];

		for(int i = 0; i< grades.length; i++){
			if(grades[i] < low){
				low = grades[i];
			}
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high = grades[0];

		for(int i = 0; i< grades.length; i++){
			if(grades[i] > high){
				high = grades[i];
			}
		}



		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		
		String output="" + Arrays.toString(grades);





		return output;
	}	
}