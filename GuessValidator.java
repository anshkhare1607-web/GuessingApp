/**
*Guessing App
*UC2: Features/UC2-User Guess Submission
*@author Developer
*version 2.0
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