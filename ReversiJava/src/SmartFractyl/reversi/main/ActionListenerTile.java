package SmartFractyl.reversi.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTile implements ActionListener{
	private int i;
	private int k;
	
	public ActionListenerTile(int p1, int p2){
		i = p1;
		k = p2;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(ReversiMain.Board[i][k]==-1){
			if(ReversiMain.isPlayer1Turn==true){
				ReversiMain.Board[i][k]=0;
				ReversiMain.Buttons[i][k].setText("o");
				ReversiMain.onPlay();
			}
			else if(ReversiMain.isPlayer1Turn==false){
				ReversiMain.Board[i][k]=1;
				ReversiMain.Buttons[i][k].setText("+");
				ReversiMain.onPlay();
			}
			
		}
		
	}

}