package prefinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class BookController implements ActionListener, WindowListener {
	
	private BookView view;
	private BookAdd bookAdd;
	private BookModal modal;

	public BookController() {
		this.view = new BookView();
		this.bookAdd = new BookAdd();
		this.modal = new BookModal();
		
		view.getFrame().addWindowListener(this);
		view.getAdd().addActionListener(this);
		view.getNext().addActionListener(this);
		view.getUpdate().addActionListener(this);
		view.getPrevious().addActionListener(this);
		view.getDelete().addActionListener(this);
		
		bookAdd.getInsert().addActionListener(this);

	}
	
	public static void main(String[] args) {
		new BookController();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
		modal.loadData();
		if (modal.isFirstInitial()) {
			view.getName().setEditable(false);
			view.getPrice().setEditable(false);
			view.getType().setEnabled(false);
		} else {
			Book book = modal.getBook(0);
			this.setDisplay(book);
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		modal.saveData();
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(view.getAdd())) {
			bookAdd.spawn();
		}
		
		if (e.getSource().equals(view.getDelete()) && modal.getBooks().size() != 0) {
			modal.getBooks().remove(modal.getCurrentPage());
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            
            if (modal.getCurrentPage() > 0) {
            	modal.setCurrentPage(modal.getCurrentPage() - 1);
    			
    			Book book = modal.getBook(modal.getCurrentPage());
    			int currentPage = Integer.parseInt(view.getCurrentIndex().getText()) - 1;
    			view.getName().setText(book.getName());
    			view.getPrice().setText(String.valueOf(book.getPrice()));
    			view.getType().setSelectedItem(book.getType());
    			view.getCurrentIndex().setText(String.valueOf(currentPage));
    			return;
            } 
            view.getName().setText("");
			view.getPrice().setText("");
			view.getType().setSelectedItem(0);
			
			view.getName().setEditable(false);
			view.getPrice().setEditable(false);
			view.getType().setEnabled(false);
		}
		
		if (e.getSource().equals(view.getNext()) && modal.getCurrentPage() + 1 < modal.getBooks().size()) {
			modal.setCurrentPage(modal.getCurrentPage() + 1);
			this.setDisplay(modal.getBook(modal.getCurrentPage()));
		}
		
		if (e.getSource().equals(view.getPrevious()) && modal.getCurrentPage() > 0) {
			modal.setCurrentPage(modal.getCurrentPage() - 1);
			
			Book book = modal.getBook(modal.getCurrentPage());
			int currentPage = Integer.parseInt(view.getCurrentIndex().getText()) - 1;
			view.getName().setText(book.getName());
			view.getPrice().setText(String.valueOf(book.getPrice()));
			view.getType().setSelectedItem(book.getType());
			view.getCurrentIndex().setText(String.valueOf(currentPage));
		}
		
		if (e.getSource().equals(view.getUpdate())) {
			int index = modal.getCurrentPage();
			Book book = modal.getBook(index);
			book.setName(view.getName().getText());
			book.setPrice(Double.parseDouble(view.getPrice().getText()));
			book.setType(view.getType().getSelectedItem().toString());
			JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
		}
		
		if (e.getSource().equals(bookAdd.getInsert())) {
			Book book = new Book();
			book.setName(bookAdd.getName().getText());
			book.setPrice(Double.parseDouble(bookAdd.getPrice().getText()));
			book.setType(bookAdd.getType().getSelectedItem().toString());
			modal.addBook(book);
			bookAdd.despawn();

			if (modal.isFirstInitial()) {
				view.getName().setEditable(true);
				view.getPrice().setEditable(true);
				view.getType().setEnabled(true);
				
				view.getName().setText(bookAdd.getName().getText());
				view.getPrice().setText(bookAdd.getPrice().getText());
				view.getType().setSelectedItem(bookAdd.getType().getSelectedItem());
				
				modal.setFirstInitial(false);
			}
			JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	private void setDisplay(Book book) {
		int currentPage = Integer.parseInt(view.getCurrentIndex().getText()) + modal.getCurrentPage();
		view.getName().setText(book.getName());
		view.getPrice().setText(String.valueOf(book.getPrice()));
		view.getType().setSelectedItem(book.getType());
		view.getCurrentIndex().setText(String.valueOf(currentPage));
	}

}
