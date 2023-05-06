package mockexamfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShopController implements ActionListener {

	private int currentIndex = 0;
	private ShopModel shopModel;

	private EditItemView editItemView;
	private InsertItemView insertItemView;
	private ShopDashboardView dashboardView;
	private LoginView loginView;

	public ShopController() {
		// TODO Auto-generated constructor stub
		loginView = new LoginView();
		dashboardView = new ShopDashboardView();
		insertItemView = new InsertItemView();
		editItemView = new EditItemView();
		shopModel = new ShopModel();

		dashboardView.getButtonLogout().addActionListener(this);
		dashboardView.getButtonEditItem().addActionListener(this);
		dashboardView.getButtonAddItem().addActionListener(this);
		editItemView.getClose().addActionListener(this);
		editItemView.getDelete().addActionListener(this);
		editItemView.getNext().addActionListener(this);
		editItemView.getPrevious().addActionListener(this);
		editItemView.getUpdate().addActionListener(this);
		insertItemView.getInsert().addActionListener(this);
		loginView.getLogin().addActionListener(this);

		dashboardView.getFrame().addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				shopModel.loadData();
				refrashTable();
			}

			@Override
			public void windowClosing(WindowEvent e) {
				shopModel.saveData();
			}
			
		});
	}

	public static void main(String[] args) {
		new ShopController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(loginView.getLogin())) {
			String username = loginView.getUsername().getText();
			String password = loginView.getPassword().getText();

			if (username.equals("jisso") && password.equals("flower_me")) {
				JOptionPane.showMessageDialog(null, "Login Success");
				loginView.getFrame().dispose();

				// Spawn dashboard frame
				dashboardView.getFrame().setVisible(true);
			}
		}
		
		if (e.getSource().equals(editItemView.getDelete()) && shopModel.getItems().size() != 0) {
			shopModel.getItems().remove(currentIndex);
            JOptionPane.showMessageDialog(null, "Done it.");
			if (currentIndex > 0) {
				currentIndex--;
				setCurrentEditItem(currentIndex);
			}
		}
		
		if (e.getSource().equals(editItemView.getUpdate())) {
			Item item = shopModel.getItems().get(currentIndex);
			item.setId(Integer.parseInt(editItemView.getId().getText()));
			item.setName(editItemView.getName().getText());
			item.setPrice(Double.parseDouble(editItemView.getPrice().getText()));
			JOptionPane.showMessageDialog(null, "Done it.");
		}
		
		if (e.getSource().equals(editItemView.getPrevious()) && currentIndex > 0) {
			currentIndex--;
			setCurrentEditItem(currentIndex);
		}
		
		if (e.getSource().equals(editItemView.getNext()) && currentIndex + 1 < shopModel.getItems().size()) {
			currentIndex++;
			setCurrentEditItem(currentIndex);
		}
		
		if (e.getSource().equals(editItemView.getClose())) {
			editItemView.getFrame().dispose();
			dashboardView.getFrame().setVisible(true);
		}

		if (e.getSource().equals(dashboardView.getButtonEditItem())) {
			dashboardView.getFrame().dispose();
			editItemView.getFrame().setVisible(true);
			
			setCurrentEditItem(currentIndex);
		}

		if (e.getSource().equals(insertItemView.getInsert())) {
			Item item = new Item();
			item.setId(Integer.parseInt(insertItemView.getId().getText()));
			item.setName(insertItemView.getName().getText());
			item.setPrice(Double.parseDouble(insertItemView.getPrice().getText()));
			item.setCreated_on(new Date());

			shopModel.addItem(item);
			JOptionPane.showMessageDialog(null, "Done it.");
			insertItemView.getFrame().dispose();

			dashboardView.getFrame().setVisible(true);
			refrashTable();
		}

		if (e.getSource().equals(dashboardView.getButtonAddItem())) {
			dashboardView.getFrame().dispose();
			insertItemView.getFrame().setVisible(true);
		}

		if (e.getSource().equals(dashboardView.getButtonLogout())) {
		shopModel.saveData();
			dashboardView.getFrame().dispose();
			JOptionPane.showMessageDialog(null, "Logout Success");

			// Spawn login frame
			loginView.getFrame().setVisible(true);
		}
	}
	
	private void setCurrentEditItem(int currentIndex) {
		if (!editItemView.getFrame().isVisible()) {
			return;
		}
		Item item = shopModel.getItems().get(currentIndex);
		editItemView.getId().setText(String.valueOf(item.getId()));
		editItemView.getName().setText(item.getName());
		editItemView.getPrice().setText(String.valueOf(item.getPrice()));
	}

	@SuppressWarnings("deprecation")
	private void refrashTable() {
		JTable table = dashboardView.getTable();
		((DefaultTableModel) table.getModel()).setRowCount(0);
		for (Item item : shopModel.getItems()) {
			String format = item.getCreated_on().getDay() + "/" + (item.getCreated_on().getMonth() + 1) + "/" + (item.getCreated_on().getYear() + 1900);
			Object[] data = { item.getId(), item.getName(), item.getPrice(), format };
			((DefaultTableModel) table.getModel()).addRow(data);
		}
	}
}
