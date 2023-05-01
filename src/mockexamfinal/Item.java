package mockexamfinal;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9066570702294546118L;
	private int id;
	private String name;
	private double price;
	private Date created_on;
	
	public Item() {
		this(0, "", 0, null);
	}

	public Item(int id, String name, double price, Date created_on) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.created_on = created_on;
	}
	
	public Date getCreated_on() {
		return created_on;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
