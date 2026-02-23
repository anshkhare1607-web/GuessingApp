/**
*Guessing App
*UC5: Features/UC5-Game Result Storage
*@author Developer
*version 5.0
*/

//This class is responsible for persisitng the final game result after the game ends.
//results stored in a file so that game history is not lost after exit.
import java.io.*;
public class StorageService{
	public static void saveResult(String player, int attempts, boolean win){
		//Try-with-resources ensures with the writer is closed automatically after the operation completes.
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("game_result.txt",true))){
			writer.write("Player : " +player+", Attempts: "+attempts+", Results: "+(win?"WIN":"LOSE"));
			writer.newLine();		
		}
		catch(IOException e){
			System.out.println("Unable to save game result.");
		}
	}
}