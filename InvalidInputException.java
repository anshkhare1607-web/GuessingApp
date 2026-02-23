/**
*Guessing App
*UC4: Features/UC4-Error Handling and Validation
*@author Developer
*version 4.0
*/

//Allows the game to fail gracefully with a meaningful message.

public class InvalidInputException extends Exception {
	public InvalidInputException(String message){
		super(message);
	}
}