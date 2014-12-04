package SmartFractyl.reversi.main;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoArea {
	static Date start = new Date();
	
	
	
	public static void initInfoArea(JFrame frame){
		JPanel infoArea = new JPanel();
		JButton endGame = new JButton("End Game");
		JLabel player1Status = new JLabel("P1's Pieces: ");
		JLabel player2Status = new JLabel("P2's Pieces: ");
		JLabel timeElapsed = new JLabel ("Time Elapsed: ");
		infoArea.add(endGame, BorderLayout.WEST);
		infoArea.add(player1Status);
		infoArea.add(player2Status);
		infoArea.add(timeElapsed, BorderLayout.EAST);
		frame.add(infoArea, BorderLayout.NORTH);

	}
	
	
}
