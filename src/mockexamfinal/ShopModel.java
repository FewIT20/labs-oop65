package mockexamfinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ShopModel {

	private ArrayList<Item> items;
	private File db;
	
	public ShopModel() {
		db = new File("jisso_shop.data");
		try {
			db.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadData() {
		try (FileInputStream input = new FileInputStream(db);
				ObjectInputStream objectInput = new ObjectInputStream(input);) {
			items = (ArrayList<Item>) objectInput.readObject();
			if (items == null) {
				items = new ArrayList<>();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try (FileOutputStream output = new FileOutputStream(db);
				ObjectOutputStream obStream = new ObjectOutputStream(output);) {
			obStream.writeObject(items);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
}
