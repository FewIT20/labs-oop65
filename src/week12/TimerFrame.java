package week12;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TimerFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		TimerClock clock = new TimerClock();
		Thread thread = new Thread(clock);
		thread.start();
        frame.setSize(450, 150);
		frame.add(clock, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
