package SmartFractyl.reversi.main;

public class GameLogic {
	public static boolean isPlayer1Turn = true;
	
	public static void onPlay(){
		
		if(isPlayer1Turn == false){
			isPlayer1Turn = true;
		}
		else if(isPlayer1Turn == true){
			isPlayer1Turn = false;
		}
		
	}
	
	public static boolean canMakeLegalMove(int i, int k){
		if(ReversiMain.Board[i][k]==-1){
			return true; 
		}
		return false;
		
	}
	
	public static boolean isGameOver(){
		int counter = 0;
		for (int i = 0; i<=ReversiMain.Board.length-1; i++){
			for (int k = 0; k<=ReversiMain.Board[i].length-1; k++){
				if(ReversiMain.Board[i][k]==-1){
					counter ++;
					
				}
				
				
			}
		}
		if(counter==64){
			return true;
		}
		return false;
		
	}
	
}