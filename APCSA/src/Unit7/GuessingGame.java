package Unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		
	}

	public void playGame()
	{
		

	
			double random = Math.random()*upperBound+1;
		
			int random2 = (int) random;
			int counter = 1;
			System.out.println("Guess the number:");
			Scanner keyboard = new Scanner(System.in);
			int x = keyboard.nextInt();
			
			System.out.println(random2);
			
		while(x != random2)	{
		
		
			System.out.println("Incorrect");
			counter++;
			System.out.println("Guess a number between 1 and " + upperBound);
			x = keyboard.nextInt();
		}
			System.out.println("Correct");
			System.out.println("It took you " + counter + " guesses to guess " + random2);
			double percentage =  (double)(counter-1)/upperBound*100;
			
			System.out.println("You guessed wrong " + percentage + "% of the time.");
		

	}

	public String toString()
	{
		String output="";
		return output;
	}
}
