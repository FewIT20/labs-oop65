package finalexam64;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class UserAdd {
	
	private JFrame frame;
	private JButton add;
	private TextField name, tel;
	private JRadioButton male, female;
	private JPanel information, gender, update;
	
	public UserAdd() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("TheatherView");
		information = new JPanel(new GridLayout(2, 2));
		gender = new JPanel(new FlowLayout());
		update = new JPanel(new FlowLayout());
		
		add = new JButton("Add");
		male = new JRadioButton("male");
		female = new JRadioButton("female");

		name = new TextField();
		tel = new TextField();
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(male);
		buttonGroup.add(female);
		
		information.add(new JLabel("Name : "));
		information.add(name);
		information.add(new JLabel("Tel : "));
		information.add(tel);
		
		gender.add(new JLabel("Gender"));
		gender.add(male);
		gender.add(female);
		
		update.add(add);
		
		frame.add(information, BorderLayout.NORTH);
		frame.add(gender, BorderLayout.CENTER);
		frame.add(add, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(false);
	}
	
	public JButton getAdd() {
		return add;
	}
	
	public JRadioButton getFemale() {
		return female;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JPanel getGender() {
		return gender;
	}
	
	public JPanel getInformation() {
		return information;
	}
	
	public JRadioButton getMale() {
		return male;
	}
	
	public TextField getName() {
		return name;
	}
	
	public TextField getTel() {
		return tel;
	}
	
	public JPanel getUpdate() {
		return update;
	}
}
