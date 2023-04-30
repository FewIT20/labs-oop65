package prefinal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookModal {

	private boolean isFirstInitial;
	private int currentPage;
	private ArrayList<Book> books;
	private File db;
	
	public BookModal() {
		// TODO Auto-generated constructor stub
		db = new File("Book.data");
		try {
			db.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadData() {
	    try (FileInputStream stream = new FileInputStream(db);
	         ObjectInputStream outputStream = new ObjectInputStream(stream)) {
	        books = (ArrayList<Book>) outputStream.readObject();
	        isFirstInitial = books.size() == 0;
	    } catch (EOFException ex) {
	        books = new ArrayList<>();
	        isFirstInitial = true;
	    } catch (IOException | ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }
	}

	public void saveData() {
		try {
			FileOutputStream stream = new FileOutputStream(db);
			ObjectOutputStream outputStream = new ObjectOutputStream(stream);
			outputStream.writeObject(books);
			stream.close();
			outputStream.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
			
	public ArrayList<Book> getBooks() {
		return books;
	}

	public Book getBook(int currentIndex) {
		return books.get(currentIndex);
	}
	
	public boolean isFirstInitial() {
		return isFirstInitial;
	}
	
	public void setFirstInitial(boolean isFirstInitial) {
		this.isFirstInitial = isFirstInitial;
	}

}
