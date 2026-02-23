/**
*Guessing App
*UC1: Feature/UC1-Game Initialization
*@author Developer
*version 1.0
*/
import java.util.Random;
import java.util.Scanner;
public class guessingApp{
	
	public static void main(String[] args){
		System.out.println("Welcome to Guessing App");
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
		
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		
		//Game loop runs until player exhausts the maximum attempts.
		while(attempts < gameConfig.getMaxAttempts()){
			System.out.print("Enter your Guess : ");
			int guess = sc.nextInt();
			attempts++;
			
			String result = GuessValidator.validateGuess(guess,gameConfig.getTargetNumber());
			System.out.println(result);
			
			//stops the loop if the answer is correct.
			if("CORRECT".equals(result)){
				break;
			}
		}
	}
	
}