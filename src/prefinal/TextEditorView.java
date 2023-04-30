package prefinal;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class TextEditorView {

	private JFrame frame;
	private TextArea textArea;
	private JMenu file;
	private JMenuItem newFile, openFile, saveFile, closeFile;
	private JMenuBar menuBar;
	
	
	public TextEditorView() {
		frame = new JFrame();
		textArea = new TextArea();
		menuBar = new JMenuBar();
		file = new JMenu("File");
		newFile = new JMenuItem("New");
		openFile = new JMenuItem("Open");
		saveFile = new JMenuItem("Save");
		closeFile = new JMenuItem("Close");
	
		file.add(newFile);
		file.add(openFile);
		file.add(saveFile);
		file.addSeparator();
		file.add(closeFile);
		
		menuBar.add(file);
		
		frame.setJMenuBar(menuBar);
		frame.add(textArea);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public JMenuItem getCloseFile() {
		return closeFile;
	}
	
	public JMenu getMenuFile() {
		return file;
	}
	
	public JMenuBar getMenuBar() {
		return menuBar;
	}
	
	public JMenuItem getNewFile() {
		return newFile;
	}
	
	public JMenuItem getOpenFile() {
		return openFile;
	}
	
	public JMenuItem getSaveFile() {
		return saveFile;
	}
	
	public TextArea getTextArea() {
		return textArea;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
}
