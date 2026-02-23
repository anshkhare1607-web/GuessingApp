/**
*Guessing App
*UC6: Features/UC6-Game Controller (Exit : Restart)
*@author Developer
*version 6.0
*/
import java.util.Random;
import java.util.Scanner;
public class guessingApp{
	
	public static void main(String[] args) throws InvalidInputException{
		Scanner sc = new Scanner(System.in);
		boolean restart = false;
		System.out.println("=======================");
		System.out.println("Welcome to Guessing App");
		System.out.println("=======================");
		
		do{
		System.out.println("Enter Player Name: ");
		String player = sc.nextLine();
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
		
		
		int attempts = 0;
		boolean win = false;
		
		
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
				win = true;
				break;
				
			}
			String hint = HintGeneration.generateHint(gameConfig.getTargetNumber(),attempts);
			System.out.println(hint);
		}
		StorageService.saveResult(player,attempts,win);
		restart = GameController.restartGame(sc);
		}while(restart);
	}
	
}