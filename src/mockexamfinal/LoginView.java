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

public class LoginView {
	
	private JFrame frame;
	private JTextField username, password;
	private JButton login;
	private JPanel information, button;
	
	public LoginView() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		information = new JPanel(new GridLayout(2, 2));
		button = new JPanel(new FlowLayout());
		
		login = new JButton("Login");
		
		username = new JTextField(10);
		password = new JTextField(10);
		
		information.add(new JLabel("Username"));
		information.add(username);
		information.add(new JLabel("Password"));
		information.add(password);
		
		button.add(login);
		
		frame.add(information, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public JTextField getUsername() {
		return username;
	}
	
	public JTextField getPassword() {
		return password;
	}
	
	public JButton getLogin() {
		return login;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
