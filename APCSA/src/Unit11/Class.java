package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		//studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		
		studentList[stuNum] = s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		
		for(Student x : studentList){
			classAverage += x.getAverage();
		}
		classAverage = (classAverage/studentList.length);


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double avg = 0;
		for(Student x : studentList){
			if(x.getName().equals(stuName)){
				avg = x.getAverage();
			}
		}

		return avg;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = studentList[0].getAverage();
		String hName ="";


		for(Student x : studentList){
			if(x.getAverage()> high){
				high = x.getAverage();
				hName = x.getName();
			}
		}
		
		

		
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = studentList[0].getAverage();
		String hName ="";		

		for(Student x : studentList){
			if(x.getAverage() < low){
				low = x.getAverage();
				hName = x.getName();
			}
		}




		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for(Student x : studentList){
			if(x.getAverage()<= 70){
				output += x.getName() + " ";
			}
		}



		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for(Student x : studentList){
			output = output + x.toString() + "\n";
		}


		return output;
	}  	
}
