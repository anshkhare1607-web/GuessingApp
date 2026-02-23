/**
*Guessing App
*UC4: Features/UC4-Error Handling and Validation
*@author Developer
*version 4.0
*/
import java.util.Random;
import java.util.Scanner;
public class guessingApp{
	
	public static void main(String[] args) throws InvalidInputException{
		System.out.println("Welcome to Guessing App");
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
		
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		
		//Game loop runs until player exhausts the maximum attempts.
		while(attempts < gameConfig.getMaxAttempts()){
			System.out.print("Enter your Guess : ");
			//int guess = ValidationService.validateInput(sc.nextLine());
			String input = sc.nextLine();
			int guess;
			
			try{
				guess = ValidationService.validateInput(input);
			}
			catch(InvalidInputException e){
					System.out.println(e.getMessage());
					System.out.println();
					continue;
			}
			
			attempts++;
			String result = GuessValidator.validateGuess(guess,gameConfig.getTargetNumber());
			System.out.println(result);
			
			//stops the loop if the answer is correct.
			if("CORRECT".equals(result)){
				break;
			}
			String hint = HintGeneration.generateHint(gameConfig.getTargetNumber(),attempts);
			System.out.println(hint);
		}
	}
	
}