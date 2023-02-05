/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week3;

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
    
    public void withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must e greater than or equal to zero.");
            return;
        }
        if ((balance - b) < 0) {
            System.out.println("Your account balance is insufficient.");
            return;
        }
        double value = balance - b;
        balance = value;
    }
    
    public void showInfo() {
        System.out.println("In "+ name +" account, there is a balance equal to "+ balance +" baht.");
    }
    
}
