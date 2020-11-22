package lagibelajar;

public class My48MethodChallange {

	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("fin", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("faye", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("sean", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("g", highScorePosition);
		

	}
	
	public static void displayHighScorePosition(String playerName, int position){
		System.out.println(playerName +" managed into position " + position + " on the high score table");
	}
	
	public static int calculateHighScorePosition (int score) {
		
		if (score >= 1000) {
			return 1;
			
		} else if (score >= 500) {
			return 2;
			
		} else if (score >=100){
			return 3;
			
		} 
			return 4;
			
		
		
	}
	
	/*aternative code mengulangin redudansi, dengan begini
	 * kode bakal lebih mudah di baca
	 * */ 
	
public static int calculateHighScorePositionAlt (int score) {
		
		int position = 4;
		if (score >= 1000) {
			position = 1;
			
		} else if (score >= 500) {
			position = 2;
			
		} else if (score >=100){
			position = 3;
			
		} 
			return position;
			
		
		
	}

}
