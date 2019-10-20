import java.util.Scanner;
import java.util.Random;

public class DiceSimulator	
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		int playerGuess;
		int computerScore = 0;
		int playerScore = 0;
		int random;
		
		int [] diceSides = {1,2,3,4,5,6};
		
		do
		{
			System.out.println("Try to guess the number you will get by throwing the dice: ");
			playerGuess = in.nextInt();
			
			while ((playerGuess < 1) || (playerGuess > 6))
			{
				System.out.println("Please enter a number between 1 and 6!" + '\n' + "Try again.");
				playerGuess = in.nextInt();
			}
			
			random = rnd.nextInt(6);
			
			if (playerGuess == random) 
			{
				playerScore = playerScore + 6;
			} else 
			{
				computerScore ++;
			}
			
			System.out.println("The score of the player is: " + playerScore);
			System.out.println("The score of the computer is: " + computerScore);
			System.out.println();
		} while (true);
	}
}