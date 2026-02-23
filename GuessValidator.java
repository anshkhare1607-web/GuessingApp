/**
*Guessing App
*UC5: Features/UC5-Game Result Storage
*@author Developer
*version 5.0
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