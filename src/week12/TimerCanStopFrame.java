package week12;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TimerCanStopFrame {

	public static boolean isPaused = false;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		TimerCanStopClock clock = new TimerCanStopClock();
		Thread thread = new Thread(clock);
		thread.start();
        frame.setSize(450, 150);
        frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				isPaused = !isPaused;
				if (isPaused) {
					clock.pauseThread();
				} else {
					clock.resumeThread();
				}
			}
		});
		frame.add(clock, BorderLayout.NORTH);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
