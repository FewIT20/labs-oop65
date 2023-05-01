package mockexamfinal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class ShopDashboardView {

	private JFrame frame;
	private JPanel welcome, button;
	private JButton buttonAddItem, buttonEditItem, buttonLogout;
	private JTable table;
	
	public ShopDashboardView() {
		frame = new JFrame();
		welcome = new JPanel(new FlowLayout());
		button = new JPanel(new FlowLayout());
		
		buttonAddItem = new JButton("Add item");
		buttonEditItem = new JButton("Edit item");
		buttonLogout = new JButton("Logout");
		
		welcome.add(new JLabel("Welcome to Jisso Marketplace"));

	    DefaultTableModel model = new DefaultTableModel();
		table = new JTable(0, 4);
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Created_On");
		table.setModel(model);
		table.setPreferredScrollableViewportSize(new Dimension(500, 300));
		
		button.add(buttonAddItem);
		button.add(buttonEditItem);
		button.add(buttonLogout);
		
		frame.add(welcome, BorderLayout.NORTH);
		frame.add(button, BorderLayout.CENTER);
		frame.add(new JScrollPane(table), BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(false);
	}

	public JButton getButtonAddItem() {
		return buttonAddItem;
	}
	
	public JButton getButtonEditItem() {
		return buttonEditItem;
	}
	
	public JButton getButtonLogout() {
		return buttonLogout;
	}
	
	public JTable getTable() {
		return table;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
