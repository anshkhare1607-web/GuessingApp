/**
*Guessing App
*UC5: Features/UC5-Game Result Storage
*@author Developer
*version 5.0
*/

//Allows the game to fail gracefully with a meaningful message.

public class InvalidInputException extends Exception {
	public InvalidInputException(String message){
		super(message);
	}
}