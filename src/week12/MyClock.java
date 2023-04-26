package week12;

import java.util.Calendar;

import javax.swing.JLabel;

import utils.FewFont;

public class MyClock extends JLabel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7221938502976302688L;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Calendar d = Calendar.getInstance();
			int sec = d.get(Calendar.SECOND);
			int min = d.get(Calendar.MINUTE);
			int hour = d.get(Calendar.HOUR_OF_DAY);
			setFont(FewFont.addThaiFont(120));
			setText(hour + ":" + min + ":" + sec);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
