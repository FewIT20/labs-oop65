package mockexamfinal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InsertItemView {

	private JFrame frame;
	private JButton insert;
	private JTextField id, name, price;
	private JPanel information, button;

	public InsertItemView() {
		frame = new JFrame();
		information = new JPanel(new GridLayout(3, 2));
		button = new JPanel(new FlowLayout());

		id = new JTextField();
		name = new JTextField();
		price = new JTextField();

		insert = new JButton("Insert Item");

		information.add(new JLabel("Id"));
		information.add(id);
		information.add(new JLabel("Name"));
		information.add(name);
		information.add(new JLabel("Price"));
		information.add(price);

		button.add(insert);

		frame.add(information, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(false);
	}

	public JTextField getId() {
		return id;
	}

	public JButton getInsert() {
		return insert;
	}

	public JTextField getName() {
		return name;
	}

	public JTextField getPrice() {
		return price;
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
