/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import utils.FewFont;

/**
 *
 * @author admin
 */
public class PoringConstructor {

	private ArrayList<Poring> poring;
	private JFrame frame;
	private JButton add;

	public PoringConstructor() {
		frame = new JFrame();
		poring = new ArrayList<>();
		frame.setLayout(new FlowLayout());
		add = new JButton("Add");

		FewFont.addThaiFont(add);
		add.addActionListener(e -> {
			poring.add(new Poring(poring.size() + 1));
		});
		frame.add(add);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new PoringConstructor();
	}

}
