/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm65;
/**
 *
 * @author LAB207_37
 */
public class Merchant extends Person {

     public Merchant() {
        this("", null, null);
    }

    public Merchant(String name, CheckingAccount acct, Item item) {
        super(name, acct, item);
        System.out.println("My name is " + name + " in Merchant class.");
    }

    @Override
    public String getInfo() {
        return "[Merchant] - My name is " + getName()+ ". " + getAccount()+ " " + getItem();
    }
    
    public Item sellItem(Person w) {
        boolean value = ((Wizard)w).pay(this, getItem().getPrice());
        if (!value) {
            System.out.println("[Merchant] - Exchange Incomplete.");
            return null;
        }
        Item item = getItem();
        setItem(null);
        System.out.println("[Merchant] - Exchange Complete.");
        return item;
    }
    
    public boolean collectMoney(Person w, double p) {
        boolean value = getAccount().deposit(p);
        if (!value) {
            System.out.println("[Merchant] - " + w.getName() + " is not enough money.");
            return false;
        }
        System.out.println("[Merchant] - I got " + w.getName() + " ("+p+").");
        return true;
    }
    
 }
