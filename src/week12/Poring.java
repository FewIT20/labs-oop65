/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author admin
 */
public class Poring {

	private PoringWorker worker;
	private JFrame frame;
	private JLabel label;

	public Poring(int countable) {
		URL url = Poring.class.getResource("/Poring.jfif");
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		worker = new PoringWorker(frame);
		label = new JLabel(new ImageIcon(url));
		label.setText(countable + "");
		frame.add(label);
		Thread thread = new Thread(worker);
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
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((int) (Math.random() * (dimension.getWidth() - frame.getWidth())), (int) (Math.random() * (dimension.getHeight() - frame.getHeight())));
		frame.pack();
		frame.setVisible(true);
		thread.start();
	}

}
