/**
*Guessing App
*UC6: Features/UC6-Game Controller (Exit : Restart)
*@author Developer
*version 6.0
*/

//Class coordinates the complete game lifecycle, allowing the player to replay or exit gracefully.
//Responsibiities : Start game->Execute the guessing flow->Persist game results - > Restart or exit the game.
import java.util.Scanner;
public class GameController{
	public static boolean restartGame(Scanner scanner){
		System.out.print("Do you want to play again? (yes/no) : ");
		return scanner.nextLine().equalsIgnoreCase("yes");
		
	}
}