/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm65;
/**
 *
 * @author LAB207_37
 */
public class Item {
    
    private String name;
    private double price;

    public Item() {
        this("", 0);
    }
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Item name " + name + " is equal to " + price + " baht.");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " price " + price + " baht.";
    }
    
}
