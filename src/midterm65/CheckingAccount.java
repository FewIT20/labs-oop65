/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm65;
/**
 *
 * @author LAB207_37
 */
public class CheckingAccount extends Account implements WithdrawAble {
    
    private static double RATE;

    public CheckingAccount() {
        this(0, "");
    }

    public CheckingAccount(double balance, String name) {
        super(balance, name);
        RATE = 0.1;
        System.out.println(name + " has successfully opened a checking account with a balance of " + balance + " baht and its rate is " + RATE + " in the account.");
    }
    
    public void setRate(double rate) {
        CheckingAccount.RATE = rate;
    }

    public double getRate() {
        return CheckingAccount.RATE;
    }

    @Override
    public void getInfoAcct() {
        System.out.println(name + " checking account has " + balance + " Baht.");
    }
    
    public void showInterest() {
        showInterest(1);
    }
    
    public void showInterest(int year) { 
        double value = getBalance() * RATE * year;
        System.out.println("I get interest " + value + " baht.");
    }

    @Override
    public boolean deposit(double a) {
        if (a < 0) {
            return false;
        }
        setBalance(getBalance() + a);
        return true;
    }

    @Override
    public boolean withdraw(double a) {
        if (a <= 0) {
            System.out.println("Not support zero or negative number.");
        } else if ((getBalance() - a) >= 0) {
            setBalance(getBalance() - a);
            System.out.println("[CA] Transaction success.");
            return true;
        } else {
            System.out.println("[CA] Transaction fail.");
        }
        return false;
    }
    
}
