/**
*Guessing App
*UC1: Feature/UC1-Game Initialization
*@author Developer
*version 1.0
*/
import java.util.Random;
public class guessingApp{
	
	public static void main(String[] args){
		System.out.println("Welcome to Guessing App");
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
	}
	
}