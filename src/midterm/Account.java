/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB207_37
 */
public abstract class Account implements DepositAble {
    
    protected double balance;
    protected String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
        System.out.println(name + " has successfully opened a deposit account with a balance of " + balance + " baht in the account.");
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void getInfoAcct();

    @Override
    public String toString() {
        return "Account balance is equal to " + balance + " baht.";
    }
    
}
