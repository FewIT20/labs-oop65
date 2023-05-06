package finalexam64;

import java.util.ArrayList;

public class TheatherController {
	
	private ArrayList<User> users;
	private UserAdd userAdd;
	private TheatherView view;
	
	public TheatherController() {
		userAdd = new UserAdd();
		view = new TheatherView();
		users = new ArrayList<>();
		
		userAdd.getAdd().addActionListener(e -> {
			int id = users.size() + 1;
			String name = userAdd.getName().getText();
			String tel = userAdd.getTel().getText();
			String gender =  userAdd.getFemale().isSelected() ? "female" : "male";
			
			User user = new User();
			user.setId(id);
			user.setName(name);
			user.setTel(tel);
			user.setGender(gender);
			
			users.add(user);
			
			userAdd.getName().setText("");
			userAdd.getTel().setText("");
			userAdd.getFemale().setSelected(false);
			userAdd.getMale().setSelected(false);
			userAdd.getFrame().dispose();
			view.getFrame().setVisible(true);
			
			view.getId_list().addItem(String.valueOf(id));
		});
		
		view.getId_list().addItemListener(e -> {
			String raw = e.getItem().toString();
			int id = Integer.parseInt(raw);
			updateInformation(id-1);
		});
		
		view.getAdd().addActionListener(e -> {
			view.getFrame().dispose();
			userAdd.getFrame().setVisible(true);
		});
	}
	
	private void updateInformation(int index) {
		User user = users.get(index);
		view.getName().setText(user.getName());
		view.getTel().setText(user.getTel());
		boolean isMale = user.getGender().equals("male");
		if (isMale) {
			view.getMale().setSelected(true);
		} else {
			view.getFemale().setSelected(true);
		}
	}
	
	public static void main(String[] args) {
		new TheatherController();
	}
	
	

}
