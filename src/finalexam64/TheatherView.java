package finalexam64;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class TheatherView {

	private JFrame frame;
	private JComboBox<String> id_list;
	private TextField name, tel, seat_field;
	private JRadioButton male, female;
	private JButton select, add, update, delete;
	private JPanel id, information, gender, seat, crud;

	public TheatherView() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("TheatherView");
		id = new JPanel(new FlowLayout());
		information = new JPanel(new GridLayout(2, 2));
		gender = new JPanel(new FlowLayout());
		seat = new JPanel(new FlowLayout());
		crud = new JPanel(new FlowLayout());

		name = new TextField();
		tel = new TextField();
		seat_field = new TextField();

		id_list = new JComboBox<>();

		select = new JButton("Select Seat");
		update = new JButton("Update");
		add = new JButton("Add");
		delete = new JButton("Delete");

		male = new JRadioButton("male");
		female = new JRadioButton("female");

		frame.setLayout(new GridLayout(5, 0));
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(male);
		buttonGroup.add(female);

		id.add(new JLabel("ID : "));
		id.add(id_list);

		information.add(new JLabel("Name : "));
		information.add(name);
		information.add(new JLabel("Tel : "));
		information.add(tel);

		gender.add(male);
		gender.add(female);

		seat.add(new JLabel("Seat : "));
		seat.add(seat_field);
		seat.add(select);

		crud.add(add);
		crud.add(update);
		crud.add(delete);

		frame.add(id);
		frame.add(information);
		frame.add(gender);
		frame.add(seat);
		frame.add(crud);

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new TheatherView();
	}

	public JButton getAdd() {
		return add;
	}

	public JPanel getCrud() {
		return crud;
	}

	public JButton getDelete() {
		return delete;
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

	public JPanel getId() {
		return id;
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

	public JPanel getSeat() {
		return seat;
	}

	public TextField getSeatField() {
		return seat_field;
	}

	public JButton getSelect() {
		return select;
	}

	public TextField getTel() {
		return tel;
	}

	public JButton getUpdate() {
		return update;
	}	
	
	public JComboBox<String> getId_list() {
		return id_list;
	}
	
	public void setId_list(JComboBox<String> id_list) {
		this.id_list = id_list;
	}
	

	

}
