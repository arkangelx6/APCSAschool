package Unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int response;
		response = keyboard.nextInt();
		GuessingGame gg = new GuessingGame(response);
		gg.playGame();



	}
}