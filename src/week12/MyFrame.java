package week12;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyClock clock = new MyClock();
		Thread thread = new Thread(clock);
		thread.start();
        frame.setSize(450, 150);
		frame.add(clock, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
