/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm65;
/**
 *
 * @author LAB207_37
 */
public abstract class Person {
    
    private String name;
    private CheckingAccount myAcct;
    private Item myItem;

    public Person() {
        this("", null, null);
    }
    
    public Person(String name, CheckingAccount acct, Item item) {
        this.name = name;
        this.myAcct = acct;
        this.myItem = item;
        System.out.println("My name is " + name + " in Person class.");
    }

    public CheckingAccount getAccount() {
        return myAcct;
    }

    public Item getItem() {
        return myItem;
    }

    public String getName() {
        return name;
    }

    public void setAccount(CheckingAccount myAcct) {
        this.myAcct = myAcct;
    }

    public void setItem(Item myItem) {
        this.myItem = myItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getInfo();
    
}
