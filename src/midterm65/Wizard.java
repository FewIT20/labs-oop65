/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm65;
/**
 *
 * @author LAB207_37
 */
public class Wizard extends Person {

    public Wizard() {
        this("", null, null);
    }

    public Wizard(String name, CheckingAccount acct, Item item) {
        super(name, acct, item);
        System.out.println("My name is " + name + " in Wizard class.");
    }

    @Override
    public String getInfo() {
        return "[Wizard] - My name is " + getName()+ ". " + getAccount()+ " " + getItem();
    }
    
    public void buyItem(Person m) {
        Item item = ((Merchant)m).sellItem(this);
        if (item == null) {
            System.out.println("[Wizard] - Failed Trade.");
            return;
        } 
        System.out.println("[Wizard] - I got it.");
        setItem(item);
    }
    
    public boolean pay(Person m, double p) {
        boolean value = getAccount().withdraw(p);
        if (!value) {
            System.out.println("[Wizard] - I do not have enough money.");
            return false;
        } 
        ((Merchant)m).collectMoney(this, p);
        System.out.println("[Wizard] - I have paid the item fees to " + m.getName() + ".");
        return true;
    }
    
}
