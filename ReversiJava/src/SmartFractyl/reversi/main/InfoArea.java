package SmartFractyl.reversi.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class InfoArea {
	static JLabel timeElapsed = new JLabel("");
	public static int secondsElapsed = 0;
	public static int minutesElapsed = 0;
	public static int hoursElapsed = 0;
	static String elapsed ="";
	static int interval = 1000; //milliseconds
	  static ActionListener timeCycle = new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  secondsElapsed ++;
	    	  updateTime();
	    	  timeElapsed.setText("Time: " + hoursElapsed + ":" + minutesElapsed + ":" +secondsElapsed);
	      }
	  };

	static Timer timer = new Timer(interval, timeCycle);
	
	
	public static void initInfoArea(JFrame frame){
		JPanel infoArea = new JPanel();
		JButton endGame = new JButton("End Game");
		JLabel player1Status = new JLabel("P1's Pieces: ");
		JLabel player2Status = new JLabel("P2's Pieces: ");
		
		infoArea.add(endGame, BorderLayout.WEST);
		infoArea.add(player1Status);
		infoArea.add(player2Status);
		infoArea.add(timeElapsed, BorderLayout.EAST);
		frame.add(infoArea, BorderLayout.NORTH);
		
		timer.start();

	}
	
	public static void updateTime(){
		
		if(secondsElapsed==60){
			minutesElapsed++;
			secondsElapsed=0;
			
		}
		if(minutesElapsed==60){
			hoursElapsed++;
		}
		
	}
	
	
	
}
