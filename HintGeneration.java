/**
*Guessing App
*UC3: Features/UC3-Hint Generation
*@author Developer
*version 3.0
*/

public class HintGeneration{
	//Generating hints on the basis of how many hints have already been used.
	//Hints provides partial info without revealing the exact number.
	public static String generateHint(int target, int hintCount){
		if(hintCount == 1){
			return (target%2==0) ? "Hint : Number is EVEN" : "Hint : Number is ODD";
		}
		else if(hintCount==2){
			return (target>50) ? "Hint : Number is greater than 50" : "Hint : Number is 50 or less";
		}
		
		else{
			return "No more hints available";
		}
	}
}