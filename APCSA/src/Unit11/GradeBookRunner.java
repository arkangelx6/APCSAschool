package Unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

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
		
		int counter = 1;
		Class test = new Class(className,numberOfStudents);
		while(numberOfStudents != counter){
		out.println("Enter the name of student" + counter + ":");
		String studentName = keyboard.nextLine();
		out.println("Enter the grades for " + studentName);
		out.println("Use the format x - grades ( 2 - 100 100)");
		String stats = keyboard.nextLine();
		test.addStudent(counter, stats);
		counter++;
		
		}
















	}		
}