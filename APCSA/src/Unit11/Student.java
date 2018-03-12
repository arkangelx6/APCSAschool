package Unit11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.awt.List;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{

		setName(name);
		setGrades(gradeList);

	}
	
	public void setName(String name)
	{

		myName = name;
		
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		
		return myGrades.getSum()/myGrades.getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (myGrades.getSum()-myGrades.getLowGrade())/(myGrades.getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		
		String output = "" + myName + " = " + myGrades.toString();
		return output;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	public void sort(){
		
		
	}
	
}
