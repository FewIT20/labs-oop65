package week3;

/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class Account {
    
    public double balance;
    public String name;
    
    public void deposit(double b) {
        if (b < 0) {
            System.out.println("The balance variable must e greater than or equal to zero.");
            return;
        }
        balance = balance + b;
    }
    
    public double withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must e greater than or equal to zero.");
            return 0;
        }
        if ((balance - b) < 0) {
            System.out.println("Your account balance is insufficient.");
            return 0;
        }
        double value = balance - b;
        balance = value;
        return b;
    }
    
    public void showInfo() {
        System.out.println("In "+ name +" account, there is a balance equal to "+ balance +" baht.");
    }
    
}
