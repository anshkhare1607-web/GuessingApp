/**
*Guessing App
*UC6: Features/UC6-Game Controller (Exit : Restart)
*@author Developer
*version 6.0
*/

//Allows the game to fail gracefully with a meaningful message.

public class InvalidInputException extends Exception {
	public InvalidInputException(String message){
		super(message);
	}
}