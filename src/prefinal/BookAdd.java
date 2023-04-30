package prefinal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookAdd {

	private JFrame frame;
	private JButton insert;
	private JTextField name, price;
	private JComboBox<String> type;
	private JPanel information, button;

	public BookAdd() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();

		button = new JPanel(new FlowLayout());
		information = new JPanel(new GridLayout(3, 2));

		name = new JTextField();
		price = new JTextField();
		
		type = new JComboBox<>();
		type.addItem("General");
		type.addItem("Computer");
		type.addItem("Math & Sci");
		type.addItem("Photo");

		information.add(new JLabel("Name"));
		information.add(name);
		information.add(new JLabel("Price"));
		information.add(price);
		information.add(new JLabel("Type"));
		information.add(type);

		insert = new JButton("Insert");

		button.add(insert);

		frame.add(information, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(false);
	}
	
	public void spawn() {
		frame.setVisible(true);
	}
	
	public void despawn() {
		frame.dispose();
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

	public JComboBox<String> getType() {
		return type;
	}

}
