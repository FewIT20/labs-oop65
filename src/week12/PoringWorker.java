package week12;

import javax.swing.JFrame;

public class PoringWorker implements Runnable {

	private JFrame frame;

	public PoringWorker(JFrame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			var xDirection = Math.random() <= 0.5 ? 1 : -1;
			var yDirection = Math.random() <= 0.5 ? 1 : -1;
			frame.setLocation(frame.getX() + (2 * xDirection), frame.getY() + (2 * yDirection));
		}
	}

}
