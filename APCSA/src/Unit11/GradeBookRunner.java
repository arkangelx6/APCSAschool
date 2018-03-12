package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;
import java.io.FileNotFoundException;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

		out.println("What is the name of this class?");
		String className = keyboard.nextLine();
		
		out.println("How many students are in this class?");
		int numberOfStudents = keyboard.nextInt();
		
		int counter = 0;
		Class test = new Class(className,numberOfStudents);
		
		while(numberOfStudents != counter){	
		
		System.out.println("Enter the name of student " + (counter+1) + ":");
		String studentName = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the grades for " + studentName);
		System.out.println("Use the format x - grades ( 2 - 100 100)");
		String stats = keyboard.nextLine();
		
		Student student = new Student(studentName, stats);
		
		test.addStudent(counter, student);
		counter++;
		
		}
		
		
		
		
		System.out.println(test.toString());
		System.out.println("Failure List: " + test.getFailureList(70));
		System.out.println("Highest Average: " + test.getStudentWithHighestAverage());
		System.out.println("Lowest Average: " + test.getStudentWithLowestAverage());
		System.out.println("Class Average: " + test.getClassAverage());











	}	
   
   
   public static void Runner(File file){
	   out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard;
		try {
			keyboard = new Scanner(file);
			
			out.println("What is the name of this class?");
			String className = keyboard.nextLine();
			
			out.println("How many students are in this class?");
			int numberOfStudents = keyboard.nextInt();
			
			int counter = 0;
			Class test = new Class(className,numberOfStudents);
			
			while(numberOfStudents != counter){	
			
			System.out.println("Enter the name of student " + (counter+1) + ":");
			String studentName = keyboard.next();
			keyboard.nextLine();
			System.out.println("Enter the grades for " + studentName);
			System.out.println("Use the format x - grades ( 2 - 100 100)");
			String stats = keyboard.nextLine();
			
			Student student = new Student(studentName, stats);
			
			test.addStudent(counter, student);
			counter++;
			
			}
			
			
			
			System.out.println("\n\n");
			System.out.println(test.toString());
			System.out.println("Failure List: " + test.getFailureList(70));
			System.out.println("Highest Average: " + test.getStudentWithHighestAverage());
			System.out.println("Lowest Average: " + test.getStudentWithLowestAverage());
			System.out.println("Class Average: " + test.getClassAverage());

			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
   }
   
   
   
}