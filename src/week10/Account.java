package week10;

import week7.*;



/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Account {
 
    protected double balance;
    protected String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
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
    
    public void showAccount() {
        System.out.println(name + " account has " + balance + " baht.");
    }
    
    public void withdraw(double a) throws WithdrawException {
        if (a < 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }
        if ((balance - a) < 0) {
            throw new WithdrawException("Account " + name + " has not enough money");
        }
        balance = balance - a;
        System.out.println(String.valueOf(a) + " baht is withdrawn from " + name + ".");
    }
    
    public void deposit(double a) {
        if (a < 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }
        balance = balance + a;
        System.out.println(String.valueOf(a) + " baht is deposited to " + name + ".");
    }
    
}
