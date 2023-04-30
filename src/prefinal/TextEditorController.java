package prefinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

public class TextEditorController implements ActionListener {

	private TextEditorView view;
	private TextEditorModal modal;
	
	public TextEditorController() {
		view = new TextEditorView();
		modal = new TextEditorModal();
		
		view.getOpenFile().addActionListener(this);
		view.getSaveFile().addActionListener(this);
		view.getNewFile().addActionListener(this);
		view.getCloseFile().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(view.getOpenFile())) {
			JFileChooser fc = new JFileChooser();
			fc.showOpenDialog(view.getFrame());
			File f = fc.getSelectedFile();
			if (f != null) {
				String text = modal.openFile(f);
				view.getTextArea().setText(text);
			}			
		} else if (e.getSource().equals(view.getNewFile())) {
			view.getTextArea().setText("");
		} else if (e.getSource().equals(view.getSaveFile())) {
			if (modal.getCurrentSelectFile() == null) {
				JFileChooser fc = new JFileChooser();
				fc.showOpenDialog(view.getFrame());
				File file = fc.getSelectedFile();
				modal.setCurrentSelectFile(file);
			} 
			modal.saveFile(view.getTextArea().getText());
		} else if (e.getSource().equals(view.getCloseFile())) {
			System.exit(0);
		}

	}
	
	public static void main(String[] args) {
		new TextEditorController();
	}
	
}
