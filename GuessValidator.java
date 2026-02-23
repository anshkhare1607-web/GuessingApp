/**
*Guessing App
*UC6: Features/UC6-Game Controller (Exit : Restart)
*@author Developer
*version 6.0
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