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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void deposit(double a) {
        if (a < 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }
        this.balance = this.balance + a;
        System.out.println(a + " baht is deposited to " + name + ".");
    }
    
    public void withdraw(double a) {
        if (a < 0) {
            System.out.println("Input number must be a positive integer.");
            return;
        }
        if ((balance - a) < 0) {
            System.out.println("Not enough money!");
            return;
        }
        this.balance = this.balance - a;
        System.out.println(a + " baht is withdrawn from " + this.name + ".");
    }
    
    public void showAccount() {
        System.out.println(this.name + " account has " + this.balance + " baht.");
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
}
