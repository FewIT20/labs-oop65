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
import javax.swing.WindowConstants;

public class BookView {

	private JComboBox<String> type;
	private JButton previous, next, add, update, delete;
	private JTextField name, price, currentIndex;
	private JPanel information, page, CRUD;
	private JFrame frame;

	public BookView() {
		frame = new JFrame();
		
		information = new JPanel(new GridLayout(3, 2));
		page = new JPanel(new FlowLayout());
		CRUD = new JPanel(new FlowLayout());
		
		previous = new JButton("<<");
		next = new JButton(">>");
		add = new JButton("Add");
		update = new JButton("Update");
		delete = new JButton("Delete");
		
		name = new JTextField();
		price = new JTextField();
		currentIndex = new JTextField();
		
		currentIndex.setText("1");
		currentIndex.setEditable(false);
		
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
		
		page.add(previous);
		page.add(currentIndex);
		page.add(next);
		
		CRUD.add(add);
		CRUD.add(update);
		CRUD.add(delete);
		
		frame.add(information, BorderLayout.NORTH);
		frame.add(page, BorderLayout.CENTER);
		frame.add(CRUD, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public JButton getAdd() {
		return add;
	}
	
	public JPanel getCRUD() {
		return CRUD;
	}
	
	public JTextField getCurrentIndex() {
		return currentIndex;
	}
	
	public JButton getDelete() {
		return delete;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JPanel getInformation() {
		return information;
	}
	
	public JTextField getName() {
		return name;
	}
	
	public JButton getNext() {
		return next;
	}
	
	public JPanel getPage() {
		return page;
	}
	
	public JButton getPrevious() {
		return previous;
	}
	
	public JTextField getPrice() {
		return price;
	}
	
	public JComboBox<String> getType() {
		return type;
	}
	
	public JButton getUpdate() {
		return update;
	}
	
}
