/**
*Guessing App
*UC4: Features/UC4-Error Handling and Validation
*@author Developer
*version 4.0
*/public class GuessValidator{
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