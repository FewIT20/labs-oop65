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

public class EditItemView {
	
	private JFrame frame;
	private JButton delete, update, close, previous, next;
	private JTextField id, name, price;
	private JPanel information, page, CRUD;
	
	public EditItemView() {
		frame = new JFrame();
		information = new JPanel(new GridLayout(3, 2));
		page = new JPanel(new FlowLayout());
		CRUD = new JPanel(new FlowLayout());
		

		id = new JTextField();
		name = new JTextField();
		price = new JTextField();
		
		delete = new JButton("Delete Item");
		update = new JButton("Update Item");
		close = new JButton("Close Item");
		previous = new JButton("<<");
		next = new JButton(">>");
		
		information.add(new JLabel("Id"));
		information.add(id);
		information.add(new JLabel("Name"));
		information.add(name);
		information.add(new JLabel("Price"));
		information.add(price);
		
		page.add(previous);
		page.add(next);
		
		CRUD.add(delete);
		CRUD.add(update);
		CRUD.add(close);
		
		frame.add(information, BorderLayout.NORTH);
		frame.add(page, BorderLayout.CENTER);
		frame.add(CRUD, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(false);
	}
	
	public JButton getClose() {
		return close;
	}
	
	public JButton getDelete() {
		return delete;
	}
	
	public JButton getNext() {
		return next;
	}
	
	public JTextField getName() {
		return name;
	}
	
	public JButton getPrevious() {
		return previous;
	}
	public JTextField getPrice() {
		return price;
	}
	
	public JButton getUpdate() {
		return update;
	}
	
	public JTextField getId() {
		return id;
	}
	
	public JFrame getFrame() {
		return frame;
	}

}
