/**
*Guessing App
*UC3: Features/UC3-Hint Generation
*@author Developer
*version 3.0
*/

public class GuessValidator{
	public static String validateGuess(int guess, int target){
		if (guess == target){
			return "CORRECT";
		}
		else if(guess < target){
			return "LOW";
		}
		else{
			return "HIGH";
		}
	}
}