/**
*Guessing App
*UC6: Features/UC6-Game Controller (Exit : Restart)
*@author Developer
*version 6.0
*/

//Handles validation of user input before it is used in game logic.
//Input checks centralised to keep main() clean and focused.

public class ValidationService{
	//Flow : Convert input to integer -> Check allowed range -> Throw custom exception if valid
	public static int validateInput(String input) throws InvalidInputException{
		try {
			int value = Integer.parseInt(input);
			if(value < 1 || value > 100){
				throw new InvalidInputException("Number must be between 1 and 100");
			}
			
			return value;
		}
		catch(NumberFormatException e){
			throw new InvalidInputException("Invalid input. Please enter numbers only.");
		}
		
	}
}