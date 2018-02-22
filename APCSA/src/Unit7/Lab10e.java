package Unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{	static Scanner keyboard;
	public static void main(String args[])
	{
		
		boolean game = true;
		
		while(true){
			System.out.println("How many numbers?");
				Scanner keyboard = new Scanner(System.in);
				int response;
				response = keyboard.nextInt();
				GuessingGame gg = new GuessingGame(response);
				gg.playGame();
				
				System.out.println("Play Again? \n1 - yes \n2 - no");
				int response2 = keyboard.nextInt();
					if(response2 == 2){
						System.exit(1);
					}
				
		}
		
			
		
	
}
}

